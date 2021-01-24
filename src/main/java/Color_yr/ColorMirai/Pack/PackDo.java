package Color_yr.ColorMirai.Pack;

import Color_yr.ColorMirai.Start;
import com.alibaba.fastjson.JSON;

import java.util.HashMap;
import java.util.Map;

/*
类型说明
0 插件开始连接
1 [机器人]图片上传前. 可以阻止上传（事件）
2 [机器人]头像被修改（通过其他客户端修改了头像）（事件）
3 [机器人]在群里的权限被改变. 操作人一定是群主（事件）
4 [机器人]被邀请加入一个群（事件）
5 [机器人]成功加入了一个新群（不确定. 可能是主动加入）（事件）
6 [机器人]成功加入了一个新群（机器人被一个群内的成员直接邀请加入了群）（事件）
7 [机器人]主动退出一个群（事件）
8 [机器人]被管理员或群主踢出群（事件）
9 [机器人]被禁言（事件）
10 [机器人]主动离线（事件）
11 [机器人]被挤下线（事件）
12 [机器人]被服务器断开（事件）
13 [机器人]因网络问题而掉线（事件）
14 [机器人]服务器主动要求更换另一个服务器（事件）
15 [机器人]登录完成, 好友列表, 群组列表初始化完成（事件）
16 [机器人]主动或被动重新登录（事件）
17 [机器人]被取消禁言（事件）
18 [机器人]成功添加了一个新好友（事件）
19 [机器人]好友头像被修改（事件）
20 [机器人]好友已被删除（事件）
21 [机器人]在好友消息发送后广播（事件）
22 [机器人]在发送好友消息前广播（事件）
23 [机器人]好友昵称改变（事件）
24 [机器人]群 "匿名聊天" 功能状态改变（事件）
25 [机器人]群 "坦白说" 功能状态改变（事件）
26 [机器人]群 "允许群员邀请好友加群" 功能状态改变（事件）
27 [机器人]入群公告改变（事件）
28 [机器人]在群消息发送后广播（事件）
29 [机器人]在发送群消息前广播（事件）
30 [机器人]群 "全员禁言" 功能状态改变（事件）
31 [机器人]群名改变（事件）
32 [机器人]图片上传成功（事件）
33 [机器人]图片上传失败（事件）
34 [机器人]成员群名片改动（事件）
35 [机器人]成成员被邀请加入群（事件）
36 [机器人]成员主动加入群（事件）
37 [机器人]一个账号请求加入群事件, [Bot] 在此群中是管理员或群主.（事件）
38 [机器人]成员被踢出群（事件）
39 [机器人]成员主动离开（事件）
40 [机器人]群成员被禁言（事件）
41 [机器人]成员权限改变（事件）
42 [机器人]成员群头衔改动（事件）
43 [机器人]群成员被取消禁言（事件）
44 [机器人]好友消息撤回（事件）
45 [机器人]群消息撤回事件（事件）
46 [机器人]一个账号请求添加机器人为好友（事件）
47 [机器人]在群临时会话消息发送后广播（事件）
48 [机器人]在发送群临时会话消息前广播（事件）
49 [机器人]收到群消息（事件）
50 [机器人]收到群临时会话消息（事件）
51 [机器人]收到朋友消息（事件）

52 [插件]发送群消息
53 [插件]发送私聊消息
54 [插件]发送好友消息
55 [插件]获取群列表
56 [插件]获取好友列表
57 [插件]获取群成员
58 [插件]获取群设置
59 [插件]回应事件

60 心跳包

61 [插件]发送图片到群
62 [插件]发送图片到私聊
63 [插件]发送图片到朋友

64 [插件]删除群员
65 [插件]禁言群员
66 [插件]解除禁言
67 [插件]开启全员禁言
68 [插件]关闭全员禁言
69 [插件]设置群名片
70 [插件]设置群名

71 [插件]撤回消息

72 [机器人]友输入状态改变（事件）
73 [机器人]好友昵称改变（事件）

74 [插件]发送语音到群

75 [插件]从本地文件加载图片发送到群
76 [插件]从本地文件加载图片发送到群私聊
77 [插件]从本地文件加载图片发送到朋友
78 [插件]从本地文件加载语音发送到群

79 [机器人]成员群恢复（事件）
80 [机器人]机器人群恢复（事件）
81 [机器人]群成员戳一戳（事件）
82 [机器人]机器人被戳一戳（事件）

83 [插件]发送私聊戳一戳
84 [插件]发送群戳一戳

86 [机器人]其他客户端上线（事件）
87 [机器人]其他客户端离线（事件）
88 [机器人]其他客户端发送消息给 Bot（事件）
89 [机器人]他客户端发送群消息（事件）

90 [插件]获取图片Url

91 [插件]获取群成员信息
92 [插件]获取朋友信息
93 [插件]发送音乐分享
94 [插件]发送群音乐分享
95 [插件]发送群成员音乐分享

127 [插件]断开连接
*/
public class PackDo {
    public static byte[] BuildPack(Object data, int index) {
        String str = JSON.toJSONString(data) + " ";
        byte[] temp = str.getBytes(Start.SendCharset);
        temp[temp.length - 1] = (byte) index;
        return temp;
    }

    public static Map<String, String> parseDataFromPack(String data) {
        Map<String, String> map = new HashMap<>();
        String[] temp = data.split("&");
        for (String item : temp) {
            String[] temp1 = item.split("=");
            if (temp1.length != 2)
                continue;
            map.put(temp1[0], temp1[1]);
        }
        return map;
    }
}
