<template>
  <a-layout id="BasicLayout">
    <a-layout-header class="header">
      <GlobalHeader/>
    </a-layout-header>
    <a-layout-content style="padding: 0 50px">
      内容
    </a-layout-content>
    <a-layout-footer style="text-align: center">
      个人博客
    </a-layout-footer>
  </a-layout>
</template>
<script lang="ts" setup>
import GlobalHeader from '@/components/GlobalHeader.vue'
</script>
<style scoped>
.site-layout-content {
  min-height: 280px;
  padding: 24px;
  background: #fff;
}

#components-layout-demo-top .logo {
  float: left;
  width: 120px;
  height: 31px;
  margin: 16px 24px 16px 0;
  background: rgba(255, 255, 255, 0.3);
}

.ant-row-rtl #components-layout-demo-top .logo {
  float: right;
  margin: 16px 0 16px 24px;
}

[data-theme='dark'] .site-layout-content {
  background: #141414;
}

#BasicLayout header{
  background-color: white;
}
</style>
