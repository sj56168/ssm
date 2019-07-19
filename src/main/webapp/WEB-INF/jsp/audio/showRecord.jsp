<%--
  Created by IntelliJ IDEA.
  User: 我不管我最帅
  Date: 2018/12/22
  Time: 9:14
  To change this template use File | Settings | File Templates.
--%>
<%@ page contentType="text/html;charset=UTF-8" language="java" %>
<html>
<head>
    <title>动态声音</title>
    <script src=".${pageContext.request.contextPath }/statics/js/jquery-1.8.3.min.js"></script>
    <%--弹窗--%>
    <link rel="stylesheet" href="${pageContext.request.contextPath }/statics/css/audio/record/bootstrap.css" type="text/css"/>
    <link rel="stylesheet" href="${pageContext.request.contextPath }/statics/css/audio/record/component.css" type="text/css"/>

    <link rel="stylesheet" href="${pageContext.request.contextPath }/statics/css/audio/showRecord.css" type="text/css"/>

</head>
<body>
<%--固定录音按钮--%>
<div class="record_box">
    <img src="${pageContext.request.contextPath }/statics/images/record.png" class="md-trigger" data-modal="modal-6"/>
</div>
<div class="container">
    <%--头部--%>
    <div class="container_head">
        <%--头像图片--%>
      <div class="user_box">
          <img src="${pageContext.request.contextPath }/statics/images/3.jpg">
      </div>
            <%--个人信息--%>
        <div class="user_info">
            <p>ps班主任</p>
        <p>07:35</p>
        </div>
        <%--标题--%>
        <div class="title">
            很多时候，之所以逼着自己往前走，不是前面的风景迷人，而是身后的现实很残酷。 ​​​​
            晚安！
        </div>
    </div>
        <%--中部播放按钮--%>
        <div class="middle">
        <div class="middle_img"><img src="${pageContext.request.contextPath }/statics/images/record/03.png"></div>
        </div>
        <%--操作--%>
        <div class="operate">
            <div class="caozuo" style="float: right">
                <img  class="img_jiange zan" src="${pageContext.request.contextPath }/statics/images/record/zan.png"/>
                <img  class="img_jiange shoucang" src="${pageContext.request.contextPath }/statics/images/record/shoucang.png"/>
                <img  class="img_jiange pinlun" src="${pageContext.request.contextPath }/statics/images/record/pinlun.png"/>
                <img  class="img_jiange delete" src="${pageContext.request.contextPath }/statics/images/record/delete.png"/>
                <img  class="img_jiange jubao" src="${pageContext.request.contextPath }/statics/images/record/jubao.png"/>
            </div>
        </div>
        <%--赞数--%>
        <div class="zan_num">
            <img src="${pageContext.request.contextPath }/statics/images/record/zan_2.png">
            <span><span>468</span>人觉得很赞</span>
        </div>
    <%--评论区（显示）--%>
    <div class="pinlun_box">
        <%--每一条评论--%>
        <div class="pinlun">
        <%--头像--%>
        <div class="pinlun_userImg"><img src="${pageContext.request.contextPath }/statics/images/3.jpg"/></div>
        <%--评论内容--%>
        <div style="display: inline-block;font-size: 0.9rem">
            <p style="color:#38bb5d">未来~：<span style="color: #000;">远方</span></p>
            <p><span>07:36</span><a href="#">删除</a></p>
        </div>
        </div>

        <div class="pinlun">
            <%--头像--%>
            <div class="pinlun_userImg"><img src="${pageContext.request.contextPath }/statics/images/3.jpg"/></div>
            <%--评论内容--%>
            <div style="display: inline-block;font-size: 0.9rem">
                <p style="color: #71afff;">未来~：<span style="color: #000;">远方</span></p>
                <p><span>07:36</span><a href="#">删除</a></p>
            </div>
        </div>

            <%--填写评论--%>
        <div class="write_pl">
            <input  class="write" type="text" value="评论">
           <%-- <textarea class="text1" style="width: 38vw;height: 5vw;display: none;">
            </textarea>--%>
            <input class="publish"  type="button" value="发表"/>
        </div>

    </div>
</div>


<div class="container">
    <%--头部--%>
    <div class="container_head">
        <%--头像图片--%>
        <div class="user_box">
            <img src="${pageContext.request.contextPath }/statics/images/3.jpg">
        </div>
        <%--个人信息--%>
        <div class="user_info">
            <p>ps班主任</p>
            <p>07:35</p>
        </div>
        <%--标题--%>
        <div class="title">
            很多时候，之所以逼着自己往前走，不是前面的风景迷人，而是身后的现实很残酷。 ​​​​
            晚安！
        </div>
    </div>
    <%--中部播放按钮--%>
    <div class="middle">
        <div class="middle_img"><img src="${pageContext.request.contextPath }/statics/images/record/03.png"></div>
    </div>
    <%--操作--%>
    <div class="operate">
        <div class="caozuo"  style="float: right">
            <img  class="img_jiange zan" src="${pageContext.request.contextPath }/statics/images/record/zan.png"/>
            <img  class="img_jiange shoucang" src="${pageContext.request.contextPath }/statics/images/record/shoucang.png"/>
            <img  class="img_jiange pinlun" src="${pageContext.request.contextPath }/statics/images/record/pinlun.png"/>
            <img  class="img_jiange delete" src="${pageContext.request.contextPath }/statics/images/record/delete.png"/>
            <img  class="img_jiange jubao" src="${pageContext.request.contextPath }/statics/images/record/jubao.png"/>
        </div>
    </div>
    <%--赞数--%>
    <div class="zan_num">
        <img src="${pageContext.request.contextPath }/statics/images/record/zan_2.png">
        <span><span>468</span>人觉得很赞</span>
    </div>
    <%--评论区（显示）--%>
    <div class="pinlun_box">
        <%--每一条评论--%>
        <div class="pinlun">
            <%--头像--%>
            <div class="pinlun_userImg"><img src="${pageContext.request.contextPath }/statics/images/3.jpg"/></div>
            <%--评论内容--%>
            <div style="display: inline-block;font-size: 0.9rem">
                <p style="color: #38bb5d;">未来~：<span style="color: #000;">远方</span></p>
                <p><span>07:36</span><a href="#">删除</a></p>
            </div>
        </div>

        <div class="pinlun">
            <%--头像--%>
            <div class="pinlun_userImg"><img src="${pageContext.request.contextPath }/statics/images/3.jpg"/></div>
            <%--评论内容--%>
            <div style="display: inline-block;font-size: 0.9rem">
                <p style="color: #71afff;">未来~：<span style="color: #000;">远方</span></p>
                <p><span>07:36</span><a href="#">删除</a></p>
            </div>
        </div>

        <%--填写评论--%>
            <div class="write_pl">
                <input  class="write" type="text" value="评论">
              <%--  <textarea class="text1" style="width: 38vw;height: 5vw;display: none;">
            </textarea>--%>
                <input class="publish" type="button" value="发表"/>
            </div>

    </div>
</div>
<%--录制弹窗--%>
<div class="md-modal md-effect-6" id="modal-6">
    <div class="md-content">
        <div class="a">
        <p onclick="getMusics()" class="md-trigger" data-modal="modal-8"><img src="${pageContext.request.contextPath }/statics/images/record/music.png">选择音乐</p>
        <div style="text-align: center">
                <input class="btn-sm close_btn" type="button"  value="开始录制">
                <input class="btn-sm close_btn" type="button"  value="停止">
            <input class="btn-sm close_btn" type="button"  value="预览">
            <br/><br/>
            <audio style="background: rgba(0,158,0,0.67)" controls="controls"></audio>
            <br/><br/><br/>
            <button class="md-close btn-sm close_btn" >Close</button>
            <button class="md-trigger btn-sm close_btn" data-modal="modal-9" >Next</button>
        </div>
        </div>
    </div>
</div>
<%--背景音乐--%>
<div class="md-modal md-effect-8" id="modal-8">
    <div class="md-content" style="text-align: center">
        <div class="a">
        <p >背景音乐列表</p>
        <div style="text-align: center;">
           <%-- <p>选择你喜欢的背景音乐..</p>--%>
            <ul style="height:140px;overflow: auto;list-style-type: none">
                <li><span class="toLeft">试听<img class="play" onclick="play()" src="${pageContext.request.contextPath }/statics/images/record/music.png"/> 情深深雨蒙蒙 <audio class="music" id="music" src="${pageContext.request.contextPath }/statics/audio/Russ%20-%20Psycho%20(Pt.%202).mp3" controls="controls" hidden></audio></span><input type="button" class="btn-xs close_btn btn_jiange use" value="使用"/> </li>
                <li><span class="toLeft">试听<img class="play" src="${pageContext.request.contextPath }/statics/images/record/music.png"/> 情深深雨蒙蒙 </span><input type="button" class="btn-xs close_btn btn_jiange" value="使用"/> </li>
                <li><span class="toLeft">试听<img class="play" src="${pageContext.request.contextPath }/statics/images/record/music.png"/> 情深深雨蒙蒙 </span><input type="button" class="btn-xs close_btn btn_jiange" value="使用"/> </li>
                <li><span class="toLeft">试听<img class="play" src="${pageContext.request.contextPath }/statics/images/record/music.png"/> 情深深雨蒙蒙 </span><input type="button" class="btn-xs close_btn btn_jiange" value="使用"/> </li>
                <li><span class="toLeft">试听<img class="play" src="${pageContext.request.contextPath }/statics/images/record/music.png"/> 情深深雨蒙蒙 </span><input type="button" class="btn-xs close_btn btn_jiange" value="使用"/> </li>
            </ul>
            <br/>
            <button class="md-close btn-sm close_btn">返回</button>
        </div>
        </div>
    </div>
</div>

<%--发布 弹窗--%>
<div class="md-modal md-effect-9" id="modal-9">
    <div class="md-content" style="text-align: center">
        <p>发布</p>
        <div>
            <textarea placeholder="写你想说的话..." style="width: 100%;border-radius: 2px;height:6vw;border: none;background: none"></textarea>
            <ul>
                <%--<li><strong>Read:</strong> modal windows will probably tell you something important so don't forget to read what they say.</li>
                <li><strong>Look:</strong> a modal window enjoys a certain kind of attention; just look at it and appreciate its presence.</li>
                <li><strong>Close:</strong> click on the button below to close the modal.</li>--%>
            </ul>
            <button class="btn-sm close_btn">发布</button>
            <button class="md-close btn-sm close_btn">返回</button>
        </div>
    </div>
</div>
<audio src="${pageContext.request.contextPath }/statics/audio/六哲%20-%20朋友名义.mp3" controls="controls"></audio>
<a href="/audio/getMusic">dianji</a>
<script type="text/javascript" src="${pageContext.request.contextPath }/statics/js/audio/showRecord.js"></script>
<%--弹窗--%>
<script type="text/javascript" src="${pageContext.request.contextPath }/statics/js/audio/record/classie.js"></script>
<script type="text/javascript" src="${pageContext.request.contextPath }/statics/js/audio/record/modalEffects.js"></script><%--end--%>
</body>

</html>
