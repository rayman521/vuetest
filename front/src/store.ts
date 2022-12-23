import { createStore } from 'vuex'

const store = createStore({
    state () {
        return {
            start : true // state 보관
        }
    },
})

export default store;