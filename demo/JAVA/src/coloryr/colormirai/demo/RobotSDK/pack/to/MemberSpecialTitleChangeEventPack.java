package coloryr.colormirai.demo.RobotSDK.pack.to;

import coloryr.colormirai.demo.RobotSDK.pack.PackBase;

/*
42 [机器人]成员群头衔改动（事件）
id:群号
fid:执行人QQ号
old:旧的状态
now:新的状态
 */
public class MemberSpecialTitleChangeEventPack extends PackBase {
    public long id;
    public long fid;
    public String old;
    public String now;

    public MemberSpecialTitleChangeEventPack(long qq, long id, long fid, String old, String now) {
        this.fid = fid;
        this.qq = qq;
        this.id = id;
        this.old = old;
        this.now = now;
    }
}
