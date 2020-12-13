package com.ruoyi.web.controller.bean;


import java.io.Serializable;

public class Role implements Serializable {
    /**
     * 角色id
     */
    private Integer rid;

    /**
     * 服务器id
     */
    private String srvId;

    /**
     * 注册渠道
     */
    private String regChannel;

    /**
     * 渠道
     */
    private String channel;

    /**
     * 帐号
     */
    private String account;

    /**
     * 角色昵称
     */
    private String name;

    /**
     * 性别
     */
    private Byte sex;

    private Short career;

    /**
     * 等级
     */
    private Short lev;

    /**
     * 登录时间
     */
    private Integer loginTime;

    /**
     * 登出时间
     */
    private Integer logoutTime;

    /**
     * 登录ip
     */
    private String loginIp;

    /**
     * 是否在线
     */
    private Byte isOnline;

    /**
     * 战斗力
     */
    private Integer power;

    /**
     * 最大战力
     */
    private Integer maxPower;

    /**
     * 竞技场战斗力
     */
    private Integer arenaPower;

    /**
     * 竞技场最大战力
     */
    private Integer arenaMaxPower;

    /**
     * 身证份号码
     */
    private String identity;

    /**
     * 禁言超时时间 0默认为不禁言
     */
    private Integer bannedTime;

    /**
     * 封号超时时间 0默认为不封号
     */
    private Integer interdictTime;

    /**
     * 头像id
     */
    private Integer faceId;

    /**
     * 0玩家 1GM 2新手指导员
     */
    private Byte capacity;

    /**
     * vip等级
     */
    private Integer vipLev;

    /**
     * 累计充值
     */
    private Integer goldAcc;

    /**
     * 当前钻石
     */
    private Integer gold;

    /**
     * 角色数据被锁住的时间
     */
    private Integer dataLock;

    /**
     * 注册时间
     */
    private Integer regTime;

    /**
     * 注册ip
     */
    private String regIp;

    /**
     * 注册设备号
     */
    private String regIdfa;

    /**
     * 注册设备ID
     */
    private String regDeviceId;

    /**
     * 注册系统
     */
    private String regOsName;

    /**
     * 注册应用名
     */
    private String regAppName;

    /**
     * 注册包名
     */
    private String regPackageName;

    /**
     * 注册包版本
     */
    private String regPackageVersion;

    /**
     * 设备id
     */
    private String deviceId;

    /**
     * 设备类型
     */
    private String deviceType;

    /**
     * 个推cid
     */
    private String getuiCid;

    /**
     * 设备号
     */
    private String idfa;

    /**
     * 当前系统
     */
    private String osName;

    /**
     * 当前应用名
     */
    private String appName;

    /**
     * 当前包名
     */
    private String packageName;

    /**
     * 当前包版本
     */
    private String packageVersion;

    /**
     * 当前系统版本
     */
    private String osVer;

    /**
     * 运营商
     */
    private String carrierName;

    /**
     * 网络环境
     */
    private String netType;

    /**
     * 分辨率
     */
    private String resolution;

    /**
     * 备份账号
     */
    private String account2;

    /**
     * 账号分组
     */
    private String accGroup;

    private Integer gameVip;

    private Integer gameTime0;

    private Integer gameTime1;

    private Integer gameTime2;

    private Integer gameTime3;

    private Integer gameTime4;

    private Integer gameTime5;

    private Integer gameTime6;

    /**
     *  快乐币
     */
    private Integer gameFzb;

    /**
     * 获取角色id
     *
     * @return rid - 角色id
     */
    public Integer getRid() {
        return rid;
    }

    /**
     * 设置角色id
     *
     * @param rid 角色id
     */
    public void setRid(Integer rid) {
        this.rid = rid;
    }

    /**
     * 获取服务器id
     *
     * @return srv_id - 服务器id
     */
    public String getSrvId() {
        return srvId;
    }

    /**
     * 设置服务器id
     *
     * @param srvId 服务器id
     */
    public void setSrvId(String srvId) {
        this.srvId = srvId;
    }

    /**
     * 获取注册渠道
     *
     * @return reg_channel - 注册渠道
     */
    public String getRegChannel() {
        return regChannel;
    }

    /**
     * 设置注册渠道
     *
     * @param regChannel 注册渠道
     */
    public void setRegChannel(String regChannel) {
        this.regChannel = regChannel;
    }

    /**
     * 获取渠道
     *
     * @return channel - 渠道
     */
    public String getChannel() {
        return channel;
    }

    /**
     * 设置渠道
     *
     * @param channel 渠道
     */
    public void setChannel(String channel) {
        this.channel = channel;
    }

    /**
     * 获取帐号
     *
     * @return account - 帐号
     */
    public String getAccount() {
        return account;
    }

    /**
     * 设置帐号
     *
     * @param account 帐号
     */
    public void setAccount(String account) {
        this.account = account;
    }

    /**
     * 获取角色昵称
     *
     * @return name - 角色昵称
     */
    public String getName() {
        return name;
    }

    /**
     * 设置角色昵称
     *
     * @param name 角色昵称
     */
    public void setName(String name) {
        this.name = name;
    }

    /**
     * 获取性别
     *
     * @return sex - 性别
     */
    public Byte getSex() {
        return sex;
    }

    /**
     * 设置性别
     *
     * @param sex 性别
     */
    public void setSex(Byte sex) {
        this.sex = sex;
    }

    /**
     * @return career
     */
    public Short getCareer() {
        return career;
    }

    /**
     * @param career
     */
    public void setCareer(Short career) {
        this.career = career;
    }

    /**
     * 获取等级
     *
     * @return lev - 等级
     */
    public Short getLev() {
        return lev;
    }

    /**
     * 设置等级
     *
     * @param lev 等级
     */
    public void setLev(Short lev) {
        this.lev = lev;
    }

    /**
     * 获取登录时间
     *
     * @return login_time - 登录时间
     */
    public Integer getLoginTime() {
        return loginTime;
    }

    /**
     * 设置登录时间
     *
     * @param loginTime 登录时间
     */
    public void setLoginTime(Integer loginTime) {
        this.loginTime = loginTime;
    }

    /**
     * 获取登出时间
     *
     * @return logout_time - 登出时间
     */
    public Integer getLogoutTime() {
        return logoutTime;
    }

    /**
     * 设置登出时间
     *
     * @param logoutTime 登出时间
     */
    public void setLogoutTime(Integer logoutTime) {
        this.logoutTime = logoutTime;
    }

    /**
     * 获取登录ip
     *
     * @return login_ip - 登录ip
     */
    public String getLoginIp() {
        return loginIp;
    }

    /**
     * 设置登录ip
     *
     * @param loginIp 登录ip
     */
    public void setLoginIp(String loginIp) {
        this.loginIp = loginIp;
    }

    /**
     * 获取是否在线
     *
     * @return is_online - 是否在线
     */
    public Byte getIsOnline() {
        return isOnline;
    }

    /**
     * 设置是否在线
     *
     * @param isOnline 是否在线
     */
    public void setIsOnline(Byte isOnline) {
        this.isOnline = isOnline;
    }

    /**
     * 获取战斗力
     *
     * @return power - 战斗力
     */
    public Integer getPower() {
        return power;
    }

    /**
     * 设置战斗力
     *
     * @param power 战斗力
     */
    public void setPower(Integer power) {
        this.power = power;
    }

    /**
     * 获取最大战力
     *
     * @return max_power - 最大战力
     */
    public Integer getMaxPower() {
        return maxPower;
    }

    /**
     * 设置最大战力
     *
     * @param maxPower 最大战力
     */
    public void setMaxPower(Integer maxPower) {
        this.maxPower = maxPower;
    }

    /**
     * 获取竞技场战斗力
     *
     * @return arena_power - 竞技场战斗力
     */
    public Integer getArenaPower() {
        return arenaPower;
    }

    /**
     * 设置竞技场战斗力
     *
     * @param arenaPower 竞技场战斗力
     */
    public void setArenaPower(Integer arenaPower) {
        this.arenaPower = arenaPower;
    }

    /**
     * 获取竞技场最大战力
     *
     * @return arena_max_power - 竞技场最大战力
     */
    public Integer getArenaMaxPower() {
        return arenaMaxPower;
    }

    /**
     * 设置竞技场最大战力
     *
     * @param arenaMaxPower 竞技场最大战力
     */
    public void setArenaMaxPower(Integer arenaMaxPower) {
        this.arenaMaxPower = arenaMaxPower;
    }

    /**
     * 获取身证份号码
     *
     * @return identity - 身证份号码
     */
    public String getIdentity() {
        return identity;
    }

    /**
     * 设置身证份号码
     *
     * @param identity 身证份号码
     */
    public void setIdentity(String identity) {
        this.identity = identity;
    }

    /**
     * 获取禁言超时时间 0默认为不禁言
     *
     * @return banned_time - 禁言超时时间 0默认为不禁言
     */
    public Integer getBannedTime() {
        return bannedTime;
    }

    /**
     * 设置禁言超时时间 0默认为不禁言
     *
     * @param bannedTime 禁言超时时间 0默认为不禁言
     */
    public void setBannedTime(Integer bannedTime) {
        this.bannedTime = bannedTime;
    }

    /**
     * 获取封号超时时间 0默认为不封号
     *
     * @return interdict_time - 封号超时时间 0默认为不封号
     */
    public Integer getInterdictTime() {
        return interdictTime;
    }

    /**
     * 设置封号超时时间 0默认为不封号
     *
     * @param interdictTime 封号超时时间 0默认为不封号
     */
    public void setInterdictTime(Integer interdictTime) {
        this.interdictTime = interdictTime;
    }

    /**
     * 获取头像id
     *
     * @return face_id - 头像id
     */
    public Integer getFaceId() {
        return faceId;
    }

    /**
     * 设置头像id
     *
     * @param faceId 头像id
     */
    public void setFaceId(Integer faceId) {
        this.faceId = faceId;
    }

    /**
     * 获取0玩家 1GM 2新手指导员
     *
     * @return capacity - 0玩家 1GM 2新手指导员
     */
    public Byte getCapacity() {
        return capacity;
    }

    /**
     * 设置0玩家 1GM 2新手指导员
     *
     * @param capacity 0玩家 1GM 2新手指导员
     */
    public void setCapacity(Byte capacity) {
        this.capacity = capacity;
    }

    /**
     * 获取vip等级
     *
     * @return vip_lev - vip等级
     */
    public Integer getVipLev() {
        return vipLev;
    }

    /**
     * 设置vip等级
     *
     * @param vipLev vip等级
     */
    public void setVipLev(Integer vipLev) {
        this.vipLev = vipLev;
    }

    /**
     * 获取累计充值
     *
     * @return gold_acc - 累计充值
     */
    public Integer getGoldAcc() {
        return goldAcc;
    }

    /**
     * 设置累计充值
     *
     * @param goldAcc 累计充值
     */
    public void setGoldAcc(Integer goldAcc) {
        this.goldAcc = goldAcc;
    }

    /**
     * 获取当前钻石
     *
     * @return gold - 当前钻石
     */
    public Integer getGold() {
        return gold;
    }

    /**
     * 设置当前钻石
     *
     * @param gold 当前钻石
     */
    public void setGold(Integer gold) {
        this.gold = gold;
    }

    /**
     * 获取角色数据被锁住的时间
     *
     * @return data_lock - 角色数据被锁住的时间
     */
    public Integer getDataLock() {
        return dataLock;
    }

    /**
     * 设置角色数据被锁住的时间
     *
     * @param dataLock 角色数据被锁住的时间
     */
    public void setDataLock(Integer dataLock) {
        this.dataLock = dataLock;
    }

    /**
     * 获取注册时间
     *
     * @return reg_time - 注册时间
     */
    public Integer getRegTime() {
        return regTime;
    }

    /**
     * 设置注册时间
     *
     * @param regTime 注册时间
     */
    public void setRegTime(Integer regTime) {
        this.regTime = regTime;
    }

    /**
     * 获取注册ip
     *
     * @return reg_ip - 注册ip
     */
    public String getRegIp() {
        return regIp;
    }

    /**
     * 设置注册ip
     *
     * @param regIp 注册ip
     */
    public void setRegIp(String regIp) {
        this.regIp = regIp;
    }

    /**
     * 获取注册设备号
     *
     * @return reg_idfa - 注册设备号
     */
    public String getRegIdfa() {
        return regIdfa;
    }

    /**
     * 设置注册设备号
     *
     * @param regIdfa 注册设备号
     */
    public void setRegIdfa(String regIdfa) {
        this.regIdfa = regIdfa;
    }

    /**
     * 获取注册设备ID
     *
     * @return reg_device_id - 注册设备ID
     */
    public String getRegDeviceId() {
        return regDeviceId;
    }

    /**
     * 设置注册设备ID
     *
     * @param regDeviceId 注册设备ID
     */
    public void setRegDeviceId(String regDeviceId) {
        this.regDeviceId = regDeviceId;
    }

    /**
     * 获取注册系统
     *
     * @return reg_os_name - 注册系统
     */
    public String getRegOsName() {
        return regOsName;
    }

    /**
     * 设置注册系统
     *
     * @param regOsName 注册系统
     */
    public void setRegOsName(String regOsName) {
        this.regOsName = regOsName;
    }

    /**
     * 获取注册应用名
     *
     * @return reg_app_name - 注册应用名
     */
    public String getRegAppName() {
        return regAppName;
    }

    /**
     * 设置注册应用名
     *
     * @param regAppName 注册应用名
     */
    public void setRegAppName(String regAppName) {
        this.regAppName = regAppName;
    }

    /**
     * 获取注册包名
     *
     * @return reg_package_name - 注册包名
     */
    public String getRegPackageName() {
        return regPackageName;
    }

    /**
     * 设置注册包名
     *
     * @param regPackageName 注册包名
     */
    public void setRegPackageName(String regPackageName) {
        this.regPackageName = regPackageName;
    }

    /**
     * 获取注册包版本
     *
     * @return reg_package_version - 注册包版本
     */
    public String getRegPackageVersion() {
        return regPackageVersion;
    }

    /**
     * 设置注册包版本
     *
     * @param regPackageVersion 注册包版本
     */
    public void setRegPackageVersion(String regPackageVersion) {
        this.regPackageVersion = regPackageVersion;
    }

    /**
     * 获取设备id
     *
     * @return device_id - 设备id
     */
    public String getDeviceId() {
        return deviceId;
    }

    /**
     * 设置设备id
     *
     * @param deviceId 设备id
     */
    public void setDeviceId(String deviceId) {
        this.deviceId = deviceId;
    }

    /**
     * 获取设备类型
     *
     * @return device_type - 设备类型
     */
    public String getDeviceType() {
        return deviceType;
    }

    /**
     * 设置设备类型
     *
     * @param deviceType 设备类型
     */
    public void setDeviceType(String deviceType) {
        this.deviceType = deviceType;
    }

    /**
     * 获取个推cid
     *
     * @return getui_cid - 个推cid
     */
    public String getGetuiCid() {
        return getuiCid;
    }

    /**
     * 设置个推cid
     *
     * @param getuiCid 个推cid
     */
    public void setGetuiCid(String getuiCid) {
        this.getuiCid = getuiCid;
    }

    /**
     * 获取设备号
     *
     * @return idfa - 设备号
     */
    public String getIdfa() {
        return idfa;
    }

    /**
     * 设置设备号
     *
     * @param idfa 设备号
     */
    public void setIdfa(String idfa) {
        this.idfa = idfa;
    }

    /**
     * 获取当前系统
     *
     * @return os_name - 当前系统
     */
    public String getOsName() {
        return osName;
    }

    /**
     * 设置当前系统
     *
     * @param osName 当前系统
     */
    public void setOsName(String osName) {
        this.osName = osName;
    }

    /**
     * 获取当前应用名
     *
     * @return app_name - 当前应用名
     */
    public String getAppName() {
        return appName;
    }

    /**
     * 设置当前应用名
     *
     * @param appName 当前应用名
     */
    public void setAppName(String appName) {
        this.appName = appName;
    }

    /**
     * 获取当前包名
     *
     * @return package_name - 当前包名
     */
    public String getPackageName() {
        return packageName;
    }

    /**
     * 设置当前包名
     *
     * @param packageName 当前包名
     */
    public void setPackageName(String packageName) {
        this.packageName = packageName;
    }

    /**
     * 获取当前包版本
     *
     * @return package_version - 当前包版本
     */
    public String getPackageVersion() {
        return packageVersion;
    }

    /**
     * 设置当前包版本
     *
     * @param packageVersion 当前包版本
     */
    public void setPackageVersion(String packageVersion) {
        this.packageVersion = packageVersion;
    }

    /**
     * 获取当前系统版本
     *
     * @return os_ver - 当前系统版本
     */
    public String getOsVer() {
        return osVer;
    }

    /**
     * 设置当前系统版本
     *
     * @param osVer 当前系统版本
     */
    public void setOsVer(String osVer) {
        this.osVer = osVer;
    }

    /**
     * 获取运营商
     *
     * @return carrier_name - 运营商
     */
    public String getCarrierName() {
        return carrierName;
    }

    /**
     * 设置运营商
     *
     * @param carrierName 运营商
     */
    public void setCarrierName(String carrierName) {
        this.carrierName = carrierName;
    }

    /**
     * 获取网络环境
     *
     * @return net_type - 网络环境
     */
    public String getNetType() {
        return netType;
    }

    /**
     * 设置网络环境
     *
     * @param netType 网络环境
     */
    public void setNetType(String netType) {
        this.netType = netType;
    }

    /**
     * 获取分辨率
     *
     * @return resolution - 分辨率
     */
    public String getResolution() {
        return resolution;
    }

    /**
     * 设置分辨率
     *
     * @param resolution 分辨率
     */
    public void setResolution(String resolution) {
        this.resolution = resolution;
    }

    /**
     * 获取备份账号
     *
     * @return account2 - 备份账号
     */
    public String getAccount2() {
        return account2;
    }

    /**
     * 设置备份账号
     *
     * @param account2 备份账号
     */
    public void setAccount2(String account2) {
        this.account2 = account2;
    }

    /**
     * 获取账号分组
     *
     * @return acc_group - 账号分组
     */
    public String getAccGroup() {
        return accGroup;
    }

    /**
     * 设置账号分组
     *
     * @param accGroup 账号分组
     */
    public void setAccGroup(String accGroup) {
        this.accGroup = accGroup;
    }

    /**
     * @return game_vip
     */
    public Integer getGameVip() {
        return gameVip;
    }

    /**
     * @param gameVip
     */
    public void setGameVip(Integer gameVip) {
        this.gameVip = gameVip;
    }

    /**
     * @return game_time_0
     */
    public Integer getGameTime0() {
        return gameTime0;
    }

    /**
     * @param gameTime0
     */
    public void setGameTime0(Integer gameTime0) {
        this.gameTime0 = gameTime0;
    }

    /**
     * @return game_time_1
     */
    public Integer getGameTime1() {
        return gameTime1;
    }

    /**
     * @param gameTime1
     */
    public void setGameTime1(Integer gameTime1) {
        this.gameTime1 = gameTime1;
    }

    /**
     * @return game_time_2
     */
    public Integer getGameTime2() {
        return gameTime2;
    }

    /**
     * @param gameTime2
     */
    public void setGameTime2(Integer gameTime2) {
        this.gameTime2 = gameTime2;
    }

    /**
     * @return game_time_3
     */
    public Integer getGameTime3() {
        return gameTime3;
    }

    /**
     * @param gameTime3
     */
    public void setGameTime3(Integer gameTime3) {
        this.gameTime3 = gameTime3;
    }

    /**
     * @return game_time_4
     */
    public Integer getGameTime4() {
        return gameTime4;
    }

    /**
     * @param gameTime4
     */
    public void setGameTime4(Integer gameTime4) {
        this.gameTime4 = gameTime4;
    }

    /**
     * @return game_time_5
     */
    public Integer getGameTime5() {
        return gameTime5;
    }

    /**
     * @param gameTime5
     */
    public void setGameTime5(Integer gameTime5) {
        this.gameTime5 = gameTime5;
    }

    /**
     * @return game_time_6
     */
    public Integer getGameTime6() {
        return gameTime6;
    }

    /**
     * @param gameTime6
     */
    public void setGameTime6(Integer gameTime6) {
        this.gameTime6 = gameTime6;
    }

    /**
     * @return game_fzb
     */
    public Integer getGameFzb() {
        return gameFzb;
    }

    /**
     * @param gameFzb
     */
    public void setGameFzb(Integer gameFzb) {
        this.gameFzb = gameFzb;
    }
}