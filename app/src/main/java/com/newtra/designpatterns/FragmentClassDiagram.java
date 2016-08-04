package com.newtra.designpatterns;

import android.os.Bundle;
import android.support.v4.app.Fragment;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.ImageView;

/**
 * Created by vset0001 on 6/20/2015.
 */
public class FragmentClassDiagram extends Fragment {

    public FragmentClassDiagram() {
    }

    private ImageView iv;

    @Override
    public View onCreateView(LayoutInflater inflater, ViewGroup container,
                             Bundle savedInstanceState) {

        View rootView = inflater.inflate(R.layout.fragment_class_diagram, container, false);

        iv = (ImageView) rootView.findViewById(R.id.imageViewClassDiagram);
//        String uri = "@drawable/" + SelectedTopic.pattern.getId();  // where myresource (without the extension) is the file
//        int imageResource = getResources().getIdentifier(uri, null, getActivity().getPackageName());
//        Drawable res = getResources().getDrawable(imageResource);
//        iv.setImageDrawable(res);

//        iv.setImageDrawable(getResources().getDrawable(R.drawable.abstract_factory_pattern));
        setImage(iv,SelectedTopic.pattern.getId());
        return rootView;
    }

    private void setImage(ImageView iv, String id) {
        switch (id){
            case "commandPattern":
                iv.setImageDrawable(getResources().getDrawable(R.drawable.command_pattern));
                break;
            case"interpreterPattern":
                iv.setImageDrawable(getResources().getDrawable(R.drawable.interpreter_pattern));
                break;
            case"mediatorPattern":
                iv.setImageDrawable(getResources().getDrawable(R.drawable.mediator_pattern));
                break;
            case"iteratorPattern":
                iv.setImageDrawable(getResources().getDrawable(R.drawable.iterator_pattern));
                break;
            case"mementoPattern":
                iv.setImageDrawable(getResources().getDrawable(R.drawable.memento_pattern));
                break;
            case"observerPattern":
                iv.setImageDrawable(getResources().getDrawable(R.drawable.observer_pattern));
                break;
            case"strategyPattern":
                iv.setImageDrawable(getResources().getDrawable(R.drawable.strategy_pattern));
                break;
            case"statePattern":
                iv.setImageDrawable(getResources().getDrawable(R.drawable.state_pattern));
                break;
            case"templatePattern":
                iv.setImageDrawable(getResources().getDrawable(R.drawable.template_pattern));
                break;
            case"visitorPattern":
                iv.setImageDrawable(getResources().getDrawable(R.drawable.vistor_pattern));
                break;
            case"bridgePattern":
                iv.setImageDrawable(getResources().getDrawable(R.drawable.bridge_pattern));
                break;
            case"adapterPattern":
                iv.setImageDrawable(getResources().getDrawable(R.drawable.adapter_pattern));
                break;
            case"compositePattern":
                iv.setImageDrawable(getResources().getDrawable(R.drawable.composite_pattern));
                break;
            case"decoratorPattern":
                iv.setImageDrawable(getResources().getDrawable(R.drawable.decorator_pattern));
                break;
            case"flyweightPattern":
                iv.setImageDrawable(getResources().getDrawable(R.drawable.flyweight_pattern));
                break;
            case"facadePattern":
                iv.setImageDrawable(getResources().getDrawable(R.drawable.facade_pattern));
                break;
            case"proxyPattern":
                iv.setImageDrawable(getResources().getDrawable(R.drawable.proxy_pattern));
                break;
            case"abstractFactoryPattern":
                iv.setImageDrawable(getResources().getDrawable(R.drawable.abstract_factory_pattern));
                break;
            case"factoryPattern":
                iv.setImageDrawable(getResources().getDrawable(R.drawable.factory_pattern));
                break;
            case"builerPattern":
                iv.setImageDrawable(getResources().getDrawable(R.drawable.builder_pattern));
                break;
            case"prototypePattern":
                iv.setImageDrawable(getResources().getDrawable(R.drawable.prototype_pattern));
                break;
            case"singletonPattern":
                iv.setImageDrawable(getResources().getDrawable(R.drawable.singleton_pattern));
                break;
            case"objectPoolPattern":
                iv.setImageDrawable(getResources().getDrawable(R.drawable.ic_home));
                break;

        }
    }

    @Override
    public void setMenuVisibility(final boolean visible) {
        super.setMenuVisibility(visible);
        if (visible && getActivity() != null) {

        }
    }


}
