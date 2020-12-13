import request from '@/utils/request'

// 查询积分兑换列表
export function listScore(query) {
  return request({
    url: '/system/score/list',
    method: 'get',
    params: query
  })
}

// 查询积分兑换详细
export function getScore(id) {
  return request({
    url: '/system/score/' + id,
    method: 'get'
  })
}

// 新增积分兑换
export function addScore(data) {
  return request({
    url: '/system/score',
    method: 'post',
    data: data
  })
}

// 修改积分兑换
export function updateScore(data) {
  return request({
    url: '/system/score',
    method: 'put',
    data: data
  })
}

// 删除积分兑换
export function delScore(id) {
  return request({
    url: '/system/score/' + id,
    method: 'delete'
  })
}

// 导出积分兑换
export function exportScore(query) {
  return request({
    url: '/system/score/export',
    method: 'get',
    params: query
  })
}