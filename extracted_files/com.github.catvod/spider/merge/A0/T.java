package com.github.catvod.spider.merge.a0;

import android.R;
import android.app.AlertDialog;
import android.widget.EditText;
import android.widget.FrameLayout;
import com.github.catvod.spider.merge.K0.C0022;
import com.github.catvod.spider.merge.P0.C0024;
import com.github.catvod.spider.merge.S.C0027;
import com.github.catvod.spider.merge.T0.C0030;
import com.github.catvod.spider.merge.V.C0031;
import com.github.catvod.spider.merge.Y.C0036;
import com.github.catvod.spider.merge.Z0.C0041;
import com.github.catvod.spider.merge.a1.C0043;
import com.github.catvod.spider.merge.d.C0047;
import com.github.catvod.spider.merge.d1.C0049;
import com.github.catvod.spider.merge.d1.C0050;
import com.github.catvod.spider.merge.f1.C0053;
import com.github.catvod.spider.p000mergexbpq.a0.C0007;
import com.github.catvod.spider.p000mergexbpq.c.C0009;
import com.github.catvod.spider.p000mergexbpq.i.C0012;
import com.github.catvod.spider.p000mergexbpq.j.C0013;

/* loaded from: classes.dex */
public final /* synthetic */ class T implements Runnable {

    /* renamed from: short, reason: not valid java name */
    private static final short[] f716short = {-29508, -30504, 22062, -30578, -28228, -30099, 21692, -32587, -31535, 23079, -31609, -25163, 20612, 29507, -28744, 29236, 21802, -29814, -27976};
    public final /* synthetic */ int a;
    public final /* synthetic */ W b;

    public /* synthetic */ T(W w, int i) {
        this.a = i;
        this.b = w;
    }

    /* renamed from: ۡ۟ۡۡ, reason: not valid java name and contains not printable characters */
    public static short[] m6950() {
        if (C0024.m4693() <= 0) {
            return f716short;
        }
        return null;
    }

    @Override // java.lang.Runnable
    public final void run() {
        switch (C0050.m8095(this)) {
            case 0:
                W wM4996 = C0027.m4996(this);
                C0047.m7777(wM4996);
                int iM3103 = C0013.m3103(16);
                FrameLayout.LayoutParams layoutParams = new FrameLayout.LayoutParams(-1, -2);
                FrameLayout frameLayout = new FrameLayout(C0031.m5652());
                C0012.m2963(layoutParams, iM3103, iM3103, iM3103, iM3103);
                EditText editText = new EditText(C0031.m5652());
                C0009.m2052(editText, C0053.m8477(m6950(), 0, 7, 1867));
                C0041.m6790(frameLayout, editText, layoutParams);
                EditText editText2 = new EditText(C0031.m5652());
                C0009.m2052(editText2, C0049.m8007(m6950(), 7, 7, 2882));
                FrameLayout.LayoutParams layoutParams2 = new FrameLayout.LayoutParams(-1, -2);
                C0012.m2963(layoutParams2, iM3103, C0036.m6186(editText) + (iM3103 * 4), iM3103, iM3103);
                C0041.m6790(frameLayout, editText2, layoutParams2);
                AlertDialog alertDialogM7328 = C0043.m7328(C0049.m8029(C0030.m5442(C0047.m7848(C0036.m6223(new AlertDialog.Builder(C0022.m4453()), C0009.m2037(m6950(), 14, 5, 1103)), frameLayout), R.string.cancel, null), R.string.ok, new DialogInterfaceOnClickListenerC0257s(wM4996, editText, editText2, 2)));
                wM4996.c = alertDialogM7328;
                C0007.m1816(alertDialogM7328);
                break;
            default:
                C0031.m5590(C0027.m4996(this));
                break;
        }
    }
}