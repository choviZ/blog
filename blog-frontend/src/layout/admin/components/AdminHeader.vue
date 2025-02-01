<template>
  <a-row justify="space-between" :wrap="false">
    <a-col>
      <menu-unfold-outlined
        v-if="collapsed"
        class="trigger"
        @click="toggleCollapsed"
      />
      <menu-fold-outlined v-else class="trigger" @click="toggleCollapsed" />
    </a-col>
    <a-col>
      <a-dropdown class="userInfo">
        <a class="ant-dropdown-link" @click.prevent>
          用户名
        </a>
        <template #overlay>
          <a-menu>
            <a-menu-item>
              <span>退出登录</span>
            </a-menu-item>
          </a-menu>
        </template>
      </a-dropdown>
    </a-col>
  </a-row>
</template>

<script lang="ts" setup>
import { defineProps } from 'vue'
import { MenuUnfoldOutlined, MenuFoldOutlined } from '@ant-design/icons-vue'

// 接收父组件传递的 collapsed
const props = defineProps({
  collapsed: Boolean
})

// 点击时触发自定义事件，将collapsed的值取反后给父组件
const emit = defineEmits(['update:collapsed'])
const toggleCollapsed = () => {
  emit('update:collapsed', !props.collapsed)
}
</script>

<style scoped>
.trigger {
  font-size: 18px;
  line-height: 64px;
  padding: 0 24px;
  cursor: pointer;
  transition: color 0.3s;
}

.trigger:hover {
  color: #1890ff;
}
.userInfo {
  margin-right: 24px;
}
</style>
