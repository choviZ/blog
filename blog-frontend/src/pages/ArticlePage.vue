<template>
  <div id="Article">
    <a-list item-layout="horizontal" :data-source="data" class="list">
      <template #renderItem="{ item }">
        <a-list-item>
          <a-list-item-meta>
            <template #title>
              <a href="https://www.antdv.com/">{{ item.title }}</a>
            </template>
            <template #description>
              {{ item.description }}
            </template>
          </a-list-item-meta>
        </a-list-item>
      </template>
    </a-list>
    <a-pagination v-model:current="current" :total="10" show-less-items  class="page"/>
  </div>

</template>
<script lang="ts" setup>
interface DataItem {
  title: string;
  description?: string;
}

const data: DataItem[] = [
  {
    title: 'Ant Design Title 1',
    description: 'aaaaa'
  },
  {
    title: 'Ant Design Title 2'
  },
  {
    title: 'Ant Design Title 3'
  },
  {
    title: 'Ant Design Title 4'
  },
  {
    title: 'Ant Design Title 2'
  },
  {
    title: 'Ant Design Title 3'
  },
  {
    title: 'Ant Design Title 4'
  },
  {
    title: 'Ant Design Title 2'
  },
  {
    title: 'Ant Design Title 3'
  },
  {
    title: 'Ant Design Title 4'
  },
  {
    title: 'Ant Design Title 2'
  },
  {
    title: 'Ant Design Title 3'
  },
  {
    title: 'Ant Design Title 4'
  }
]

import { ref } from 'vue'

const current = ref(1)
</script>

<style scoped>
#Article {
  width: 100%;
  background-color: #eee !important;
  margin-top: 16px;

}

#Article .list {
  background-color: white;
  border-radius: 8px;
}
#Article .page{
  margin-top: 12px;
}
</style>

