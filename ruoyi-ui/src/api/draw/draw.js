import request from '@/utils/request'

// 获取抽奖物品列表及人物信息
export function getItemsAndPersonInfo() {
  return request({
    url: '/draw/getPlayerInfo',
    method: 'get'
  })
}

// 开始抽奖
export function getReward(beginDraw) {
  return request({
    url: '/draw/getReward',
    method: 'get',
    params: beginDraw
  })
}

// 开始抽奖
export function getReward10(beginDraw) {
  return request({
    url: '/draw/getReward10',
    method: 'get',
    params: beginDraw
  })
}

// 发送每日奖励
export function sendDayFuli() {
  return request({
    url: '/draw/dayFuli',
    method: 'get'
  })
}

// 发送回档福利
export function sendHolidayFulii() {
  return request({
    url: '/draw/holidayFuli',
    method: 'get'
  })
}
