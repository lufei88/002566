package com.github.catvod.spider.merge.e0;

import android.app.Activity;
import android.view.KeyEvent;
import android.view.MotionEvent;
import android.view.View;
import android.widget.FrameLayout;
import com.github.catvod.spider.merge.G.C0019;
import com.github.catvod.spider.merge.Q0.C0026;
import com.github.catvod.spider.merge.T0.C0030;
import com.github.catvod.spider.merge.V.C0032;
import com.github.catvod.spider.merge.Y.C0035;
import com.github.catvod.spider.merge.Z.C0037;
import com.github.catvod.spider.merge.Z.C0038;
import com.github.catvod.spider.merge.Z.C0039;
import com.github.catvod.spider.merge.h.C0054;
import com.github.catvod.spider.p000mergexbpq.Q.C0001;
import com.github.catvod.spider.p000mergexbpq.a0.C0006;
import com.github.catvod.spider.p000mergexbpq.b0.C0008;
import com.github.catvod.spider.p000mergexbpq.r.C0014;

/* renamed from: com.github.catvod.spider.merge.e0.d, reason: case insensitive filesystem */
/* loaded from: classes.dex */
public final class C0285d extends FrameLayout {

    /* renamed from: short, reason: not valid java name */
    private static final short[] f779short = {2091, 2105, 2110, 2090, 2101, 2105, 2091, 2051, 2094, 2099, 2099, 2088};
    public final /* synthetic */ int a;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public /* synthetic */ C0285d(Activity activity, int i) {
        super(activity);
        this.a = i;
    }

    /* renamed from: ۡۦۡۤ, reason: not valid java name and contains not printable characters */
    public static short[] m8171() {
        if (C0014.m3353() <= 0) {
            return f779short;
        }
        return null;
    }

    @Override // android.view.ViewGroup, android.view.View
    public boolean dispatchKeyEvent(KeyEvent keyEvent) {
        switch (C0038.m6418(this)) {
            case 1:
                if (C0006.m1722(keyEvent) != 0 || C0039.m6525(keyEvent) != 4) {
                    return super.dispatchKeyEvent(keyEvent);
                }
                try {
                    C0038.m6417(C0035.m6110());
                } catch (Exception unused) {
                }
                return true;
            default:
                return super.dispatchKeyEvent(keyEvent);
        }
    }

    @Override // android.view.ViewGroup, android.view.ViewParent
    public View focusSearch(View view, int i) {
        switch (C0038.m6418(this)) {
            case 1:
                return view;
            default:
                return super.focusSearch(view, i);
        }
    }

    @Override // android.view.View
    public boolean onTouchEvent(MotionEvent motionEvent) {
        View viewM5716;
        int i;
        switch (C0038.m6418(this)) {
            case 0:
                if (C0008.m2000(motionEvent) == 0 && (viewM5716 = C0032.m5716(this, C0019.m4107(m8171(), 0, 12, 2140))) != null) {
                    int[] iArr = new int[2];
                    C0001.m1195(viewM5716, iArr);
                    int iM4921 = (int) C0026.m4921(motionEvent);
                    int iM5366 = (int) C0030.m5366(motionEvent);
                    int i2 = iArr[0];
                    if (iM4921 < i2 || iM4921 > C0037.m6344(viewM5716) + i2 || iM5366 < (i = iArr[1]) || iM5366 > C0054.m8631(viewM5716) + i) {
                        try {
                            C0038.m6417(C0035.m6110());
                            return true;
                        } catch (Exception unused) {
                            return true;
                        }
                    }
                }
                return super.onTouchEvent(motionEvent);
            default:
                return super.onTouchEvent(motionEvent);
        }
    }
}