package com.github.catvod.spider.merge.a0;

import android.R;
import android.app.AlertDialog;
import android.text.SpannableString;
import android.text.style.RelativeSizeSpan;
import android.widget.EditText;
import android.widget.FrameLayout;
import android.widget.TextView;
import com.github.catvod.spider.merge.C.C0017;
import com.github.catvod.spider.merge.G.C0019;
import com.github.catvod.spider.merge.K0.C0022;
import com.github.catvod.spider.merge.T0.C0030;
import com.github.catvod.spider.merge.V.C0031;
import com.github.catvod.spider.merge.V.C0033;
import com.github.catvod.spider.merge.Y.C0036;
import com.github.catvod.spider.merge.Z.C0037;
import com.github.catvod.spider.merge.Z.C0038;
import com.github.catvod.spider.merge.Z0.C0041;
import com.github.catvod.spider.merge.b.C0044;
import com.github.catvod.spider.merge.d.C0047;
import com.github.catvod.spider.merge.d1.C0049;
import com.github.catvod.spider.merge.f1.C0053;
import com.github.catvod.spider.merge.h.C0054;
import com.github.catvod.spider.merge.p.C0057;
import com.github.catvod.spider.merge.x0.C0063;
import com.github.catvod.spider.merge.y0.C0064;
import com.github.catvod.spider.p000mergexbpq.Q.C0000;
import com.github.catvod.spider.p000mergexbpq.R.C0003;
import com.github.catvod.spider.p000mergexbpq.S.C0004;
import com.github.catvod.spider.p000mergexbpq.S.C0005;
import com.github.catvod.spider.p000mergexbpq.a0.C0006;
import com.github.catvod.spider.p000mergexbpq.c.C0009;
import com.github.catvod.spider.p000mergexbpq.c0.C0010;
import com.github.catvod.spider.p000mergexbpq.i.C0012;
import com.github.catvod.spider.p000mergexbpq.j.C0013;
import java.util.List;

/* loaded from: classes.dex */
public final /* synthetic */ class N implements Runnable {

    /* renamed from: short, reason: not valid java name */
    private static final short[] f713short = {637, 538, 528, 518, 516, 637, 636, 549, 563, 560, 566, 563, 548, 21588, 18628, 29331, 22262, -30078, 20705, 24615, 18730, -30624, -28681, 25291, 25813, 18534, 23779, 24758, 21786, 1943, -30624, -28681, 24225, -29691, 24252, 21431, 27870, 30954, 29027, 2008, 2000, -29465, -30589, 22133, 1863, 1905, 1906, 1908, 1905, 1894, 20512, 20560, -30348, -29424, 21478, -28763, 20852, -32248, -31124, 22682, 21049, 29182, -29662, -30650, 22192, 1922, 1972, 1975, 1969, 1972, 1955, 18484, 26554};
    public final /* synthetic */ int a;
    public final /* synthetic */ S b;

    public /* synthetic */ N(S s, int i) {
        this.a = i;
        this.b = s;
    }

    /* renamed from: ۧ۟ۢۡ, reason: not valid java name and contains not printable characters */
    public static short[] m6941() {
        if (C0005.m1599() < 0) {
            return f713short;
        }
        return null;
    }

    @Override // java.lang.Runnable
    public final void run() {
        switch (C0006.m1794(this)) {
            case 0:
                S sM8654 = C0054.m8654(this);
                C0047.m7777(sM8654);
                try {
                    List listM5833 = C0033.m5833(C0038.m6452(m6941(), 0, 13, 594));
                    int iM3103 = C0013.m3103(16);
                    FrameLayout.LayoutParams layoutParams = new FrameLayout.LayoutParams(-1, -2);
                    FrameLayout frameLayout = new FrameLayout(C0031.m5652());
                    SpannableString spannableString = new SpannableString(C0044.m7509(m6941(), 13, 28, 1979));
                    C0064.m9607(spannableString, new RelativeSizeSpan(0.7f), 0, C0000.m1100(spannableString), 0);
                    TextView textView = new TextView(C0031.m5652());
                    C0042.m7106(textView, spannableString);
                    C0003.m1372(textView, 2, 14.0f);
                    double d = iM3103;
                    C0004.m1564(d);
                    int i = (int) (1.5d * d);
                    C0017.m3709(textView, i, iM3103 / 2, iM3103, iM3103);
                    C0037.m6336(frameLayout, textView);
                    C0012.m2963(layoutParams, iM3103, i, iM3103, iM3103);
                    EditText editText = new EditText(C0031.m5652());
                    C0053.m8415(editText, 1);
                    String strM2947 = C0012.m2947(listM5833, 0);
                    if (C0057.m8953(strM2947)) {
                        C0009.m2052(editText, C0063.m9585(m6941(), 41, 11, 1808));
                    } else {
                        C0042.m7106(editText, strM2947);
                    }
                    C0041.m6790(frameLayout, editText, layoutParams);
                    EditText editText2 = new EditText(C0031.m5652());
                    C0053.m8415(editText2, 1);
                    String strM29472 = C0012.m2947(listM5833, 1);
                    if (C0057.m8953(strM29472)) {
                        C0009.m2052(editText2, C0010.m2300(m6941(), 52, 5, 643));
                    } else {
                        C0042.m7106(editText2, strM29472);
                    }
                    FrameLayout.LayoutParams layoutParams2 = new FrameLayout.LayoutParams(-1, -2);
                    C0012.m2963(layoutParams2, iM3103, (iM3103 * 4) + C0036.m6186(editText), iM3103, iM3103);
                    C0041.m6790(frameLayout, editText2, layoutParams2);
                    EditText editText3 = new EditText(C0031.m5652());
                    C0053.m8415(editText3, 1);
                    String strM29473 = C0012.m2947(listM5833, 2);
                    if (C0057.m8953(strM29473)) {
                        C0009.m2052(editText3, C0000.m1077(m6941(), 57, 5, 2559));
                    } else {
                        C0042.m7106(editText3, strM29473);
                    }
                    FrameLayout.LayoutParams layoutParams3 = new FrameLayout.LayoutParams(-1, -2);
                    C0004.m1564(d);
                    double d2 = d * 6.5d;
                    double dM6186 = C0036.m6186(editText);
                    C0004.m1564(dM6186);
                    double d3 = d2 + dM6186;
                    double dM61862 = C0036.m6186(editText2);
                    C0004.m1564(dM61862);
                    C0012.m2963(layoutParams3, iM3103, (int) (d3 + dM61862), iM3103, iM3103 / 4);
                    C0041.m6790(frameLayout, editText3, layoutParams3);
                    sM8654.b = C0019.m4124(C0049.m8029(C0030.m5442(C0047.m7848(C0036.m6223(new AlertDialog.Builder(C0022.m4453()), C0036.m6188(m6941(), 62, 11, 2005)), frameLayout), R.string.cancel, null), R.string.ok, new O(sM8654, editText, editText2, editText3, 0)));
                    break;
                } catch (Exception unused) {
                    return;
                }
            default:
                S sM86542 = C0054.m8654(this);
                C0047.m7777(sM86542);
                try {
                    AlertDialog alertDialogM3145 = C0013.m3145(sM86542);
                    if (alertDialogM3145 != null) {
                        C0004.m1577(alertDialogM3145);
                        break;
                    }
                } catch (Exception unused2) {
                    return;
                }
                break;
        }
    }
}