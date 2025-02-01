<template>
  <!-- 外层容器 -->
  <a-layout style="min-height: 100vh">
    <!--  左侧 侧边栏  -->
    <a-layout-sider v-model:collapsed="collapsed">
      <AdminMenu />
    </a-layout-sider>

    <!--  主容器  -->
    <a-layout>
      <!--  顶部导航栏   -->
      <a-layout-header style="background: #fff; padding: 0">
        <AdminHeader :collapsed="collapsed" @update:collapsed="collapsed = $event" />
      </a-layout-header>

      <!--  内容区域    -->
      <a-layout-content>
        标签导航栏
        <router-view />
      </a-layout-content>

      <!--  底部区域   -->
      <a-layout-footer style="text-align: center">
        <AdminFooter />
      </a-layout-footer>

    </a-layout>
  </a-layout>
</template>
<script lang="ts" setup>

import { ref } from 'vue'
import AdminFooter from '@/layout/admin/components/AdminFooter.vue'
import AdminMenu from '@/layout/admin/components/AdminMenu.vue'
import AdminHeader from '@/layout/admin/components/AdminHeader.vue'

const collapsed = ref<boolean>(false)

</script>
<style scoped>
#components-layout-demo-side .logo {
  height: 32px;
  margin: 16px;
  background: rgba(255, 255, 255, 0.3);
}

.site-layout .site-layout-background {
  background: #fff;
}

[data-theme='dark'] .site-layout .site-layout-background {
  background: #141414;
}
</style>
