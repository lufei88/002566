package com.github.catvod.spider.merge.h0;

import android.view.View;
import android.view.animation.Animation;
import com.github.catvod.spider.merge.T0.C0030;
import com.github.catvod.spider.merge.W.C0034;
import com.github.catvod.spider.merge.Z.C0039;
import com.github.catvod.spider.merge.Z.C0040;
import com.github.catvod.spider.merge.a0.C0042;
import com.github.catvod.spider.merge.z.C0065;
import com.github.catvod.spider.p000mergexbpq.Q.C0001;
import com.github.catvod.spider.p000mergexbpq.S.C0004;
import com.github.catvod.spider.p000mergexbpq.r.C0014;

/* renamed from: com.github.catvod.spider.merge.h0.k, reason: case insensitive filesystem */
/* loaded from: classes.dex */
public final class AnimationAnimationListenerC0331k implements Animation.AnimationListener {
    public final /* synthetic */ int a;
    public final /* synthetic */ View b;
    public final /* synthetic */ Object c;

    public /* synthetic */ AnimationAnimationListenerC0331k(Object obj, View view, int i) {
        this.a = i;
        this.c = obj;
        this.b = view;
    }

    private final void a(Animation animation) {
    }

    private final void b(Animation animation) {
    }

    private final void c(Animation animation) {
    }

    private final void d(Animation animation) {
    }

    private final void e(Animation animation) {
    }

    private final void f(Animation animation) {
    }

    @Override // android.view.animation.Animation.AnimationListener
    public final void onAnimationEnd(Animation animation) {
        switch (C0042.m7126(this)) {
            case 0:
                C0040.m6667(C0030.m5411((C0335o) C0001.m1144(this)));
                C0034.m5953(C0065.m9742(this));
                break;
            case 1:
                C0040.m6667(C0014.m3296((C0340u) C0001.m1144(this)));
                C0034.m5953(C0065.m9742(this));
                break;
            default:
                C0004.m1577(C0039.m6522((x) C0001.m1144(this)));
                C0034.m5953(C0065.m9742(this));
                break;
        }
    }

    @Override // android.view.animation.Animation.AnimationListener
    public final void onAnimationRepeat(Animation animation) {
        C0042.m7126(this);
    }

    @Override // android.view.animation.Animation.AnimationListener
    public final void onAnimationStart(Animation animation) {
        C0042.m7126(this);
    }
}