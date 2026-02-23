package com.github.catvod.spider.merge.W;

import android.app.Activity;
import android.view.KeyEvent;
import android.view.MotionEvent;
import android.view.View;
import android.widget.FrameLayout;
import com.github.catvod.spider.merge.F0.C0018;
import com.github.catvod.spider.merge.Q0.C0025;
import com.github.catvod.spider.merge.S.C0027;
import com.github.catvod.spider.merge.Z.C0037;
import com.github.catvod.spider.merge.Z.C0038;
import com.github.catvod.spider.merge.Z.C0039;
import com.github.catvod.spider.merge.b0.C0045;
import com.github.catvod.spider.merge.f1.C0053;
import com.github.catvod.spider.merge.h.C0054;
import com.github.catvod.spider.merge.h0.C0314C;
import com.github.catvod.spider.merge.h0.C0315D;
import com.github.catvod.spider.merge.z.C0065;
import com.github.catvod.spider.p000mergexbpq.a0.C0006;

/* loaded from: classes.dex */
public final class A extends FrameLayout {
    public final /* synthetic */ int a;
    public final /* synthetic */ Object b;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public /* synthetic */ A(Object obj, int i, Activity activity) {
        super(activity);
        this.a = i;
        this.b = obj;
    }

    @Override // android.view.ViewGroup, android.view.View
    public boolean dispatchKeyEvent(KeyEvent keyEvent) {
        switch (C0053.m8451(this)) {
            case 0:
                if (C0006.m1722(keyEvent) != 0 || C0039.m6525(keyEvent) != 4) {
                    return super.dispatchKeyEvent(keyEvent);
                }
                try {
                    C c = (C) C0018.m3988(this);
                    if (C0053.m8421(c)) {
                        return true;
                    }
                    c.d = true;
                    C0037.m6386(C0027.m5022(c), new y(c, 0));
                    return true;
                } catch (Exception unused) {
                    return true;
                }
            default:
                return super.dispatchKeyEvent(keyEvent);
        }
    }

    @Override // android.view.ViewGroup, android.view.ViewParent
    public View focusSearch(View view, int i) {
        switch (C0053.m8451(this)) {
            case 0:
                return view;
            default:
                return super.focusSearch(view, i);
        }
    }

    @Override // android.view.View
    public boolean onTouchEvent(MotionEvent motionEvent) {
        switch (C0053.m8451(this)) {
            case 1:
                C0314C c0314cM7551 = C0045.m7551((C0315D) C0018.m3988(this));
                if (c0314cM7551 != null) {
                    float fM9763 = C0065.m9763(motionEvent);
                    float fM6420 = C0038.m6420(motionEvent);
                    int iM6344 = (C0037.m6344(c0314cM7551) / 2) + C0025.m4784(c0314cM7551);
                    int iM8631 = (C0054.m8631(c0314cM7551) / 2) + C0034.m6009(c0314cM7551);
                    int iM63442 = C0037.m6344(c0314cM7551) / 2;
                    float f = fM9763 - iM6344;
                    float f2 = fM6420 - iM8631;
                    if ((f2 * f2) + (f * f) <= iM63442 * iM63442) {
                        return true;
                    }
                }
                return false;
            default:
                return super.onTouchEvent(motionEvent);
        }
    }
}