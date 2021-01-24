function bar_click(labelName) {
    //alert(labelName);
    // $.ajax({
    //     type: "post",
    //     url: "manager/getUserInfoById",
    //     data: {
    //         id: id
    //     },
    //     complete: function (data) {
    //         var json1 = $.parseJSON(data.responseText);
    //         $("#userid").val(json1["id"]);
    //         $("#username").val(json1['username']);
    //         $("#password").val(json1['password']);
    //         $("#role").val(json1['role']);
    //     },
    //     error: function () {
    //         alert("查询失败！");
    //     }
    // });
    $.ajax({
        type : "post", //传输方式为post
        url : "/searchByCategory?category="+labelName, //这就是使用的url
        complete : function(data) {
            var msg = JSON.stringify(data)
            var json1 = JSON.parse(msg);

//json1.responseText就是服务器返回的数据
            document.getElementById('category').innerHTML = "";
            //  alert(json1.responseText);
            // 将html渲染到前端
            $("#category").html(json1.responseText);
        }
    });

}