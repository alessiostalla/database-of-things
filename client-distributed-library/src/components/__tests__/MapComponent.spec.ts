import { describe, it, expect } from 'vitest'

import { mount } from '@vue/test-utils'
import MapComponent from '../MapComponent.vue'

describe('MapComponent', () => {
  it('renders properly', () => {
    const wrapper = mount(MapComponent, { props: { msg: 'Hello Vitest' } })
    expect(wrapper.text()).toContain('Hello Vitest')
  })
})
