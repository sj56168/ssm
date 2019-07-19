<%@ page language="java" contentType="text/html; charset=UTF-8"
         pageEncoding="UTF-8"%>
<!DOCTYPE html PUBLIC "-//W3C//DTD HTML 4.01 Transitional//EN" "http://www.w3.org/TR/html4/loose.dtd">
<html>
<head>
    <meta http-equiv="Content-Type" content="text/html; charset=UTF-8">
    <title>Insert title here</title>

</head>
<body>
<h1>Html5网页JavaScript录制MP3音频</h1>
<button onclick="funStart(this);" id="btnStart" disabled >录制</button>
<button onclick="funStop(this);" id="btnStop" disabled>停止</button>
<button onclick="funUpload(this);" id="btnUpload" disabled>上传</button>
<h4>调试信息：</h4>
<div id="recordingslist"></div>
<script type="text/javascript" src="../../../statics/js/jquery-1.8.3.min.js"></script>
<script src="../../../statics/js/audio/recordmp3.js"></script>
<script>
    var recorder = new MP3Recorder({
        debug:true,
        funOk: function () {
            btnStart.disabled = false;
            log('初始化成功');
        },
        funCancel: function (msg) {
            alert("asdasda");
            log(msg);
            recorder = null;
        }
    });
    var mp3Blob;
    function funStart(button) {
        btnStart.disabled = true;
        btnStop.disabled = false;
        btnUpload.disabled = true;
        log('录音开始...');
        recorder.start();
    }

    function funStop(button) {
        recorder.stop();
        btnStart.disabled = false;
        btnStop.disabled = true;
        btnUpload.disabled = false;
        log('录音结束，MP3导出中...');
        recorder.getMp3Blob(function (blob) {
            log('MP3导出成功');

            mp3Blob = blob;
            var url = URL.createObjectURL(mp3Blob);
            var div = document.createElement('div');
            var au = document.createElement('audio');
            var hf = document.createElement('a');

            au.controls = true;
            au.src = url;
            hf.href = url;
            hf.download = new Date().toISOString() + '.mp3';
            hf.innerHTML = hf.download;
            div.appendChild(au);
            div.appendChild(hf);
            recordingslist.appendChild(div);
        });
    }

    function log(str) {
        recordingslist.innerHTML += str + '<br/>';
    }

    function funUpload() {
        var fd = new FormData();
        var mp3Name = encodeURIComponent('audio_recording_' + new Date().getTime() + '.mp3');
        fd.append('mp3Name', mp3Name);
        fd.append('file', mp3Blob);

        var xhr = new XMLHttpRequest();
        xhr.onreadystatechange = function () {
            if (xhr.readyState == 4 && xhr.status == 200) {
                recordingslist.innerHTML += '上传成功：<a href="' + xhr.responseText + '" target="_blank">' + mp3Name + '</a>';
            }
        };

        xhr.open('POST', 'upload.ashx');
        xhr.send(fd);
    }
</script>
</body>
</html>