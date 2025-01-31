// 导入axios
import axios from 'axios'
//1. 创建新的axios实例，
const service = axios.create({
  baseURL: 'http://localhost:8081/api',
  timeout: 5 * 1000
})
// 2.请求拦截器
service.interceptors.request.use(config => {
  return config
}, error => {
  Promise.reject(error)
})

// 3.响应拦截器
service.interceptors.response.use(response => {
  return response
}, error => {

  //如果不需要错误处理，以上的处理过程都可省略
  return Promise.resolve(error.response)
})

export default service
