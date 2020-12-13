import request from '@/utils/request'

// 查询游戏用户列表
export function listAccount(query) {
  return request({
    url: '/system/account/list',
    method: 'get',
    params: query
  })
}

// 查询游戏用户详细
export function getAccount(uid) {
  return request({
    url: '/system/account/' + uid,
    method: 'get'
  })
}

// 新增游戏用户
export function addAccount(data) {
  return request({
    url: '/system/account',
    method: 'post',
    data: data
  })
}

// 修改游戏用户
export function updateAccount(data) {
  return request({
    url: '/system/account',
    method: 'put',
    data: data
  })
}

// 删除游戏用户
export function delAccount(uid) {
  return request({
    url: '/system/account/' + uid,
    method: 'delete'
  })
}

// 导出游戏用户
export function exportAccount(query) {
  return request({
    url: '/system/account/export',
    method: 'get',
    params: query
  })
}