<%@ page language="java" contentType="text/html; charset=UTF-8"
         pageEncoding="UTF-8"%>
<!DOCTYPE html PUBLIC "-//W3C//DTD HTML 4.01 Transitional//EN" "http://www.w3.org/TR/html4/loose.dtd">
<html>
<head>
    <meta http-equiv="Content-Type" content="text/html; charset=UTF-8">
    <title>Title</title>
    <script type="text/javascript" src="../../../statics/js/jquery-1.8.3.min.js"></script>

</head>
<body>
<h1>Html5网页JavaScript录制MP3音频</h1>
<button onclick="funStart(this);" id="btnStart" disabled>录制</button>
<button onclick="funStop(this);" id="btnStop" disabled>停止</button>
<button onclick="funUpload(this);" id="btnUpload" disabled>上传</button>
<h4>调试信息：</h4>
<div id="recordingslist"></div>
<div>
    <audio controls autoplay></audio>
    <input onclick="startRecording()" type="button" value="录音" />
    <input onclick="stopRecording()" type="button" value="停止" />
    <input onclick="playRecording()" type="button" value="播放" />
    <input onclick="uploadAudio()" type="button" value="提交" />
</div>
<div id="showmessage"></div>
<script src="../../../statics/js/audio/HZRecorder.js"></script>


<script>

    var recorder;

    var audio = document.querySelector('audio');

    function startRecording() {
        HZRecorder.get(function (rec) {
            recorder = rec;
            recorder.start();
            $("#showmessage").append("开始录制...<br/>");
            time(this);

        });
    }

    function stopRecording() {
        recorder.stop();
        $("#showmessage").append("录制完毕...<br/>");

    }
    function playRecording() {
        recorder.play(audio);
    }

    function uploadAudio() {
        recorder.upload("Handler1.ashx", function (state, e) {
            switch (state) {
                case 'uploading':
                    //var percentComplete = Math.round(e.loaded * 100 / e.total) + '%';
                    break;
                case 'ok':
                    //alert(e.target.responseText);
                    alert("上传成功");
                    break;
                case 'error':
                    alert("上传失败");
                    break;
                case 'cancel':
                    alert("上传被取消");
                    break;
            }
        });
    }

    var wait=20;
    function time(obj) {
        if(wait==0){
             /*$("#getCode").val("获取验证码");*/
            stopRecording();
            wait=20;
        }
        else{
            /*$("#getCode").attr("disabled",true);
            $("#getCode").val(wait+"秒后重试");*/
            $("#showmessage").append("还剩"+wait+"秒<br/>");
            wait--;
            setTimeout(function (){time(obj);
            },1000);
        }
    }
</script>
</body>
</html>
