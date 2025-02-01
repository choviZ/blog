import { createRouter, createWebHistory } from 'vue-router'
import AdminLayout from '@/layout/admin/AdminLayout.vue'
import BasicLayout from '@/layout/BasicLayout.vue'

const router = createRouter({
  history: createWebHistory(import.meta.env.BASE_URL),
  routes: [
    // 用户端
    {
      path: '/',
      name: 'home',
      component: BasicLayout,
      children: [
        {
          path: 'article',
          name: 'article',
          component: () => import('../pages/ArticlePage.vue')
        }
      ]
    },

    // 管理端
    {
      path: '/admin',
      component: AdminLayout,
      children: [
        {
          path: 'index',
          component: () => import('@/pages/admin/DashboardPage.vue')
        },
        {
          path: 'article',
          component: () => import('@/pages/admin/ArticleManagePage.vue')
        },
        {
          path: 'category',
          component: () => import('@/pages/admin/CateGoryManagePage.vue')
        },
        {
          path: 'tags',
          component: () => import('@/pages/admin/TagsManagePage.vue')
        },
        {
          path: 'settings',
          component: () => import('@/pages/admin/BlogSettingsPage.vue')
        }
      ]
    }

  ]
})

export default router
