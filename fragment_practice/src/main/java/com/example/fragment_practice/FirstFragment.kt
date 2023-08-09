package com.example.fragment_practice

import androidx.fragment.app.Fragment


class FirstFragment : Fragment(R.layout.fragment_first) {

/*
    override fun onCreateView(
        inflater: LayoutInflater, container: ViewGroup?,
        savedInstanceState: Bundle?
    ): View? {
        // Inflate the layout for this fragment
        return inflater.inflate(R.layout.fragment_first, container, false)
        // 첫번쨰가 inflate해줄 layout file
        //lifecycle 떄문에 override로 하나 더 oncreate형성
    }
    //짧은 버전으로 쓸거라 필요없어 더 짧게 행동 가능
*/
    //activity의 oncreate랑 다름
    //activity에선 contentview를 oncreate 안에 넣는데 프래그먼트는 안 그럼!
    //fragment는 onCreateview가 contenview역할을 해서 그럼
    //oncreate후에 oncreateview가 되므로 접근 할 수 없다->fragment_first 생성 안돼서 접근 불가
    //따라서 onviewCreated를 해야 접근 가능


}