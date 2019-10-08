package com.dantu.clothes

import android.os.Bundle
import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import androidx.fragment.app.Fragment
import com.bumptech.glide.Glide
import kotlinx.android.synthetic.main.add_a_cloth_fragment_layout.*

class AddAClothFragment : Fragment() {

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
    }

    override fun onCreateView(
        inflater: LayoutInflater,
        container: ViewGroup?,
        savedInstanceState: Bundle?
    ): View? {
        super.onCreateView(inflater, container, savedInstanceState)

        val rootView = inflater.inflate(R.layout.add_a_cloth_fragment_layout, container, false)
        return rootView
    }

    override fun onViewCreated(view: View, savedInstanceState: Bundle?) {
        super.onViewCreated(view, savedInstanceState)
        arguments?.also {
            it.get("IMAGE_PATH")?.also {
                context?.let { it1 ->
                    Glide
                        .with(it1)
                        .load(it)
                        .optionalFitCenter()
                        .into(view.findViewById(R.id.captured_image))
                };
            }
        }
    }


}