package coloryr.colormirai.demo.RobotSDK.pack.to;

import coloryr.colormirai.demo.RobotSDK.pack.PackBase;

/*
20 [机器人]好友已被删除（事件）
id:好友QQ号
 */
public class FriendDeleteEventPack extends PackBase {
    public long id;

    public FriendDeleteEventPack(long qq, long id) {
        this.id = id;
        this.qq = qq;
    }
}
