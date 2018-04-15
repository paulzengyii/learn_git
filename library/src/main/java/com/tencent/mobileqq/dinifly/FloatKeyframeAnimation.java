package com.tencent.mobileqq.dinifly;

import java.util.List;

import static com.tencent.mobileqq.dinifly.MiscUtils.lerp;

class FloatKeyframeAnimation extends KeyframeAnimation<Float> {

  FloatKeyframeAnimation(List<Keyframe<Float>> keyframes) {
    super(keyframes);
  }

  @Override Float getValue(Keyframe<Float> keyframe, float keyframeProgress) {
    if (keyframe.startValue == null || keyframe.endValue == null) {
      throw new IllegalStateException("Missing values for keyframe.");
    }
    return lerp(keyframe.startValue, keyframe.endValue, keyframeProgress);
  }
}
