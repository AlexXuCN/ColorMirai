package coloryr.colormirai.demo.RobotSDK.pack.re;

import coloryr.colormirai.demo.RobotSDK.pack.PackBase;

import java.util.List;

/*
57 [插件]获取群成员
id:群号
members:成员列表
 */
public class ListMemberPack extends PackBase {
    public long id;
    public List<MemberInfoPack> members;
}
