# TimeSelecter
##示例<br>
###图片
![image text](https://github.com/tanyadong/TimeSelecter/blob/master/img/show.png)
![image text](https://github.com/tanyadong/TimeSelecter/blob/master/img/show1.png)
![image text](https://github.com/tanyadong/TimeSelecter/blob/master/img/show2.png) <br>如果感兴趣可[下载demo](https://github.com/tanyadong/TimeSelecter/blob/master/apk/app-debug.apk)<br>

##介绍
基于timeselecter，可以设置当前时间，仿IOS滚轮效果,界面美观，使用方便。<br>
##使用<br>
```
private TimeSelector timeSelector;
timeSelector = new TimeSelector(this, null,"1980-01-01 00:00" , "2150-12-31 23:59"); //初始化控件
startTimeTxt = (TextView) findViewById(R.id.txt_starttime); //显示时间的textview
endTimeTxt = (TextView) findViewById(R.id.txt_endtime);
timeSelector.show(startTimeTxt); //显示时间轴控件
```
    
    

