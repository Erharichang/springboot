 //封装共性,提取特性
       function doAjaxGet(url,params,callback){//定义函数(函数声明方式)
    	   //1.创建XHR对象
    	   const xhr=new XMLHttpRequest();
    	   //2.定义XHR对象的状态监听函数
    	   xhr.onreadystatechange=function(){
    		   if(xhr.readyState==4&&xhr.status==200){
    		    callback(xhr.responseText);//回调函数
    		   }
    	   }
    	   //3.建立连接
    	   xhr.open("GET",`${url}?${params}`,true);
    	   //4.发送请求
    	   xhr.send(null);
       }
       function doAjaxPost(url,params,callback){
    	   //1.创建XHR对象
    	   const xhr=new XMLHttpRequest();
    	   //2.定义XHR对象的状态监听函数
    	   xhr.onreadystatechange=function(){
    		   if(xhr.readyState==4&&xhr.status==200){
    		     callback(xhr.responseText);//回调函数
    		   }
    	   }
    	   //3.建立连接
    	   xhr.open("POST",url,true);
    	   xhr.setRequestHeader("Content-Type","application/x-www-form-urlencoded");
    	   //4.发送请求
    	   xhr.send(params);
       }