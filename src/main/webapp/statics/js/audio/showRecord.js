/**
 * Created by 我不管我最帅 on 2018/12/22.
 */
$(document).ready(function(){
    //点赞
    $(".zan").hover(function(){
        //当前索引
        var index=$(".zan").index($(this));
        $(".zan").eq(index).attr("src","../../../statics/images/record/zan_1.png");
    },function () {
        $(this).attr("src","../../../statics/images/record/zan.png");
    });
    //收藏
    $(".shoucang").hover(function(){
        //当前索引
        var index=$(".shoucang").index($(this));
        $(".shoucang").eq(index).attr("src","../../../statics/images/record/shoucang_1.png");
    },function () {
        $(this).attr("src","../../../statics/images/record/shoucang.png");
    });
    //评论
    $(".pinlun").hover(function(){
        //当前索引
        var index=$(".pinlun").index($(this));
        $(".pinlun").eq(index).attr("src","../../../statics/images/record/pinlun_1.png");
    },function () {
        $(this).attr("src","../../../statics/images/record/pinlun.png");
    });
    //举报
    $(".jubao").hover(function(){
        //当前索引
        var index=$(".jubao").index($(this));
        $(".jubao").eq(index).attr("src","../../../statics/images/record/jubao_1.png");
    },function () {
        $(this).attr("src","../../../statics/images/record/jubao.png");
    });
    //删除
    $(".delete").hover(function(){
        //当前索引
        var index=$(".delete").index($(this));
        $(".delete").eq(index).attr("src","../../../statics/images/record/delete_1.png");
    },function () {
        $(this).attr("src","../../../statics/images/record/delete.png");
    });

    //点击写评论
});

function aa(){
    alert("asd");
}
/*控制音乐播放暂停*/
function play(){
    var curMusic=$(".music")[0];  //jq 转成js对象
    if(curMusic!==null){
        if(curMusic.paused){
            curMusic.play();
        }
        else {
            curMusic.pause();
        }

    }
}
/*查询音乐*/
function getMusics(){
    $.ajax({
        contentType:'application/json;charset=utf-8',
        url:"/audio/getMusic",
        async:true,
        type:"post",
        dataType:"json",
        success:function(data){
            alert(data);
        },
        error: function (XMLHttpRequest, textStatus) {
            alert(XMLHttpRequest.status);
            alert(XMLHttpRequest.readyState);
            alert(textStatus);
        }
    })
}
