package com.ruoyi.system.service.impl;

import java.util.List;

import org.apache.ibatis.annotations.Param;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import com.ruoyi.system.mapper.GameAccountMapper;
import com.ruoyi.system.domain.GameAccount;
import com.ruoyi.system.service.IGameAccountService;

/**
 * 游戏用户Service业务层处理
 *
 * @author lcb
 * @date 2020-12-03
 */
@Service
public class GameAccountServiceImpl implements IGameAccountService {
    @Autowired
    private GameAccountMapper gameAccountMapper;

    /**
     * 查询游戏用户
     *
     * @param uid 游戏用户ID
     * @return 游戏用户
     */
    @Override
    public GameAccount selectGameAccountById(Integer uid) {
        return gameAccountMapper.selectGameAccountById(uid);
    }

    /**
     * 查询游戏用户列表
     *
     * @param gameAccount 游戏用户
     * @return 游戏用户
     */
    @Override
    public List<GameAccount> selectGameAccountList(GameAccount gameAccount) {
        return gameAccountMapper.selectGameAccountList(gameAccount);
    }

    /**
     * 新增游戏用户
     *
     * @param gameAccount 游戏用户
     * @return 结果
     */
    @Override
    public int insertGameAccount(GameAccount gameAccount) {
        return gameAccountMapper.insertGameAccount(gameAccount);
    }

    /**
     * 修改游戏用户
     *
     * @param gameAccount 游戏用户
     * @return 结果
     */
    @Override
    public int updateGameAccount(GameAccount gameAccount) {
        return gameAccountMapper.updateGameAccount(gameAccount);
    }

    /**
     * 批量删除游戏用户
     *
     * @param uids 需要删除的游戏用户ID
     * @return 结果
     */
    @Override
    public int deleteGameAccountByIds(Integer[] uids) {
        return gameAccountMapper.deleteGameAccountByIds(uids);
    }

    /**
     * 删除游戏用户信息
     *
     * @param uid 游戏用户ID
     * @return 结果
     */
    @Override
    public int deleteGameAccountById(Integer uid) {
        return gameAccountMapper.deleteGameAccountById(uid);
    }

    @Override
    public GameAccount selectGameAccountByName(String userName) {
        return gameAccountMapper.selectGameAccountByName(userName);
    }

    @Override
    public int updateGameAccountByVersion(Long count, Long version, String username) {
        return gameAccountMapper.updateByVersion(count, version, username);
    }

    @Override
    public void updategameAccountCount() {
        gameAccountMapper.updateGameAccountCount();
    }

    @Override
    public void updategameAccountIp() {
        gameAccountMapper.updategameAccountIp();
    }
}
