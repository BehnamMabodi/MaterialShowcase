package uk.co.deanwild.materialshowcaseview.Animation;

import android.graphics.Point;
import android.view.View;

import uk.co.deanwild.materialshowcaseview.MaterialShowcaseView;


public interface IAnimationFactory {

    void fadeInView(View target, long duration, AnimationStartListener listener);

    void fadeOutView(View target, long duration, AnimationEndListener listener);

    void animateTargetToPoint(MaterialShowcaseView showcaseView, Point point);

    public interface AnimationStartListener {
        void onAnimationStart();
    }

    public interface AnimationEndListener {
        void onAnimationEnd();
    }
}

