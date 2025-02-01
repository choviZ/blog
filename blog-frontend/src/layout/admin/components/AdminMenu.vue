<template>
  <a-menu v-model:selectedKeys="currentKey" theme="dark" mode="inline" @click="doMenuClick">
    <div class="logo">
      <h2>Blog</h2>
    </div>
    <a-menu-item key="/admin/index">
      <pie-chart-outlined />
      <span>仪表盘</span>
    </a-menu-item>
    <a-menu-item key="/admin/article">
      <FileTextOutlined />
      <span>文章管理</span>
    </a-menu-item>
    <a-menu-item key="/admin/category">
      <FolderOpenOutlined />
      <span>分类管理</span>
    </a-menu-item>
    <a-menu-item key="/admin/tags">
      <TagOutlined />
      <span>标签管理</span>
    </a-menu-item>
    <a-menu-item key="/admin/settings">
      <SettingOutlined />
      <span>博客设置</span>
    </a-menu-item>
  </a-menu>
</template>

<script setup lang="ts">

import {
  PieChartOutlined,
  FileTextOutlined,
  FolderOpenOutlined,
  SettingOutlined,
  TagOutlined
} from '@ant-design/icons-vue'
import { ref } from 'vue'
import router from '@/router'
import { useRoute } from 'vue-router'

// 当前选中的菜单项
const route = useRoute();
const currentKey = ref<string[]>([route.path])

// 点击菜单后的处理函数
interface menuEvent {
  key: string
}
const doMenuClick = ({ key }: menuEvent) => {
  router.push(key)
}
</script>

<style scoped>
.logo {
  margin-top: 30px;
  height: 30px;
  text-align: center;
}
</style>
