<template>
  <div>
    <a-row :wrap="false">
      <a-col :span="8">
        <h2>zcw的个人博客</h2>
      </a-col>
      <a-col flex="auto">
        <a-menu v-model:selectedKeys="current" mode="horizontal" :items="items"
                @click="doMenuClick" />
      </a-col>
    </a-row>
  </div>
</template>

<script setup lang="ts">
import { h, ref } from 'vue'
import { FileTextOutlined, AppstoreOutlined } from '@ant-design/icons-vue'
import { type MenuProps } from 'ant-design-vue'
import router from '@/router'
// 当前选中的菜单项
const current = ref<string[]>(['mail'])
// 菜单项
const items = ref<MenuProps['items']>([
  {
    key: '/',
    label: '首页',
    title: '首页'
  },
  {
    key: '/article',
    icon: () => h(FileTextOutlined),
    label: '文章',
    title: '文章'
  },
  {
    key: 'app',
    icon: () => h(AppstoreOutlined),
    label: '规划',
    title: '规划'
  }
])
// 点击菜单后的处理
interface MenuEvent {
  key: string
}
const doMenuClick = ({ key }: MenuEvent) => {
  router.push(key)
}
</script>

<style scoped>

</style>
