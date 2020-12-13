package com.ruoyi.system.mapper;

import java.util.List;

import com.ruoyi.system.domain.GameAccount;
import org.apache.ibatis.annotations.Param;

/**
 * 游戏用户Mapper接口
 *
 * @author lcb
 * @date 2020-12-03
 */
public interface GameAccountMapper {
    /**
     * 查询游戏用户
     *
     * @param uid 游戏用户ID
     * @return 游戏用户
     */
    public GameAccount selectGameAccountById(Integer uid);

    /**
     * 查询游戏用户列表
     *
     * @param gameAccount 游戏用户
     * @return 游戏用户集合
     */
    public List<GameAccount> selectGameAccountList(GameAccount gameAccount);

    /**
     * 新增游戏用户
     *
     * @param gameAccount 游戏用户
     * @return 结果
     */
    public int insertGameAccount(GameAccount gameAccount);

    /**
     * 修改游戏用户
     *
     * @param gameAccount 游戏用户
     * @return 结果
     */
    public int updateGameAccount(GameAccount gameAccount);

    /**
     * 删除游戏用户
     *
     * @param uid 游戏用户ID
     * @return 结果
     */
    public int deleteGameAccountById(Integer uid);

    /**
     * 批量删除游戏用户
     *
     * @param uids 需要删除的数据ID
     * @return 结果
     */
    public int deleteGameAccountByIds(Integer[] uids);

    GameAccount selectGameAccountByName(String userName);

    int updateByVersion(@Param("count") Long count, @Param("version") Long version, @Param("username") String username);

    void updateGameAccountCount();
}
