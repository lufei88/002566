package com.github.catvod.spider.merge.h0;

import android.R;
import android.app.AlertDialog;
import android.text.SpannableString;
import android.text.style.RelativeSizeSpan;
import android.widget.EditText;
import android.widget.FrameLayout;
import android.widget.TextView;
import com.github.catvod.spider.merge.C.C0017;
import com.github.catvod.spider.merge.F0.C0018;
import com.github.catvod.spider.merge.G.C0019;
import com.github.catvod.spider.merge.I0.C0020;
import com.github.catvod.spider.merge.K0.C0022;
import com.github.catvod.spider.merge.P0.C0024;
import com.github.catvod.spider.merge.Q0.C0025;
import com.github.catvod.spider.merge.Q0.C0026;
import com.github.catvod.spider.merge.T0.C0030;
import com.github.catvod.spider.merge.V.C0031;
import com.github.catvod.spider.merge.V.C0033;
import com.github.catvod.spider.merge.W.DialogInterfaceOnClickListenerC0226b;
import com.github.catvod.spider.merge.Y.C0035;
import com.github.catvod.spider.merge.Y.C0036;
import com.github.catvod.spider.merge.Z.C0037;
import com.github.catvod.spider.merge.Z.C0039;
import com.github.catvod.spider.merge.Z0.C0041;
import com.github.catvod.spider.merge.a0.C0042;
import com.github.catvod.spider.merge.a1.C0043;
import com.github.catvod.spider.merge.b0.C0045;
import com.github.catvod.spider.merge.d.C0047;
import com.github.catvod.spider.merge.d0.C0048;
import com.github.catvod.spider.merge.d1.C0049;
import com.github.catvod.spider.merge.f1.C0053;
import com.github.catvod.spider.merge.p.C0057;
import com.github.catvod.spider.merge.r0.C0059;
import com.github.catvod.spider.merge.y0.C0064;
import com.github.catvod.spider.p000mergexbpq.Q.C0000;
import com.github.catvod.spider.p000mergexbpq.R.C0003;
import com.github.catvod.spider.p000mergexbpq.S.C0004;
import com.github.catvod.spider.p000mergexbpq.S.C0005;
import com.github.catvod.spider.p000mergexbpq.c.C0009;
import com.github.catvod.spider.p000mergexbpq.i.C0012;
import com.github.catvod.spider.p000mergexbpq.j.C0013;
import com.github.catvod.spider.p000mergexbpq.x.C0016;
import java.util.List;

/* loaded from: classes.dex */
public final /* synthetic */ class y implements Runnable {

    /* renamed from: short, reason: not valid java name */
    private static final short[] f823short = {1234, 1230, 1230, 1226, 1152, 1173, 1173, 2063, 2060, 2060, 2050, 2061, 2074, 2117, 2119, 2138, 2125, 2124, 2058, 2129, 2138, 2056, 2118, 2128, 2132, 2134, 2141, 2129, 2132, 2139, 2136, 2112, 2067, 2130, 2138, 2056, 2141, 2113, 2136, 2137, 2112, 2118, 2128, 2119, 2143, 2125, 3157, 3122, 3128, 3118, 3116, 3157, 3156, 3088, 3091, 3103, 3074, 3091, 21821, 26790, 1045, 22593, -32256, 25055, 29386, 22445, 30944, 21794, 19289, 22457, 1043, 22431, -27569, 1045, 22593, -32256, 25055, 1043, -30727, 22424, 19037, 29030, 1146, 1029, -29267, 25566, -32299, -31311, 23367, -31807, 28082, 2579, -30501, -29505, 21065, -30001, 25788, 798, -29019, -30015, 21559, -29519, 25282, 1377, -32254, -31130, 22672, -30689, 21103, 18364, -32746, 28261, 24261, 24245, 24594, 31352, -29206, 21276};
    public final /* synthetic */ int a;
    public final /* synthetic */ com.github.catvod.spider.merge.a0.S b;

    public /* synthetic */ y(com.github.catvod.spider.merge.a0.S s, int i) {
        this.a = i;
        this.b = s;
    }

    /* renamed from: ۡۤۧۦ, reason: not valid java name and contains not printable characters */
    public static short[] m8675() {
        if (C0059.m9257() <= 0) {
            return f823short;
        }
        return null;
    }

    @Override // java.lang.Runnable
    public final void run() {
        switch (C0024.m4671(this)) {
            case 0:
                com.github.catvod.spider.merge.a0.S sM1615 = C0005.m1615(this);
                C0047.m7777(sM1615);
                try {
                    List listM5833 = C0033.m5833(C0039.m6551(m8675(), 46, 12, 3194));
                    int iM3103 = C0013.m3103(16);
                    FrameLayout.LayoutParams layoutParams = new FrameLayout.LayoutParams(-1, -2);
                    FrameLayout frameLayout = new FrameLayout(C0031.m5652());
                    SpannableString spannableString = new SpannableString(C0048.m7902(m8675(), 58, 28, 1102));
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
                    String strM4940 = C0026.m4940(listM5833, 0);
                    if (C0057.m8953(strM4940)) {
                        C0009.m2052(editText, C0035.m6131(m8675(), 86, 6, 2594));
                    } else {
                        C0042.m7106(editText, strM4940);
                    }
                    C0041.m6790(frameLayout, editText, layoutParams);
                    EditText editText2 = new EditText(C0031.m5652());
                    C0053.m8415(editText2, 1);
                    String strM49402 = C0026.m4940(listM5833, 1);
                    if (C0057.m8953(strM49402)) {
                        C0009.m2052(editText2, C0033.m5852(m8675(), 92, 6, 812));
                    } else {
                        C0042.m7106(editText2, strM49402);
                    }
                    FrameLayout.LayoutParams layoutParams2 = new FrameLayout.LayoutParams(-1, -2);
                    C0012.m2963(layoutParams2, iM3103, (iM3103 * 4) + C0036.m6186(editText), iM3103, iM3103);
                    C0041.m6790(frameLayout, editText2, layoutParams2);
                    EditText editText3 = new EditText(C0031.m5652());
                    C0053.m8415(editText3, 1);
                    String strM49403 = C0026.m4940(listM5833, 2);
                    if (C0057.m8953(strM49403)) {
                        C0009.m2052(editText3, C0020.m4199(m8675(), 98, 6, 1362));
                    } else {
                        C0042.m7106(editText3, strM49403);
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
                    sM1615.b = C0019.m4124(C0049.m8029(C0030.m5442(C0020.m4201(C0047.m7848(C0036.m6223(new AlertDialog.Builder(C0022.m4453()), C0009.m2037(m8675(), 104, 10, 2549)), frameLayout), C0025.m4795(m8675(), 114, 4, 633), new DialogInterfaceOnClickListenerC0226b(6, sM1615)), R.string.cancel, null), R.string.ok, new com.github.catvod.spider.merge.a0.O(sM1615, editText, editText2, editText3, 2)));
                    break;
                } catch (Exception unused) {
                    return;
                }
            case 1:
                C0045.m7652(C0005.m1615(this));
                break;
            case 2:
                com.github.catvod.spider.merge.a0.S sM16152 = C0005.m1615(this);
                C0047.m7777(sM16152);
                C0016.m3575(new y(sM16152, 3));
                break;
            default:
                com.github.catvod.spider.merge.a0.S sM16153 = C0005.m1615(this);
                C0047.m7777(sM16153);
                try {
                    StringBuilder sb = new StringBuilder(C0041.m6779(m8675(), 0, 7, 1210));
                    C0018.m3933(sb, C0017.m3708());
                    C0018.m3933(sb, C0043.m7290(m8675(), 7, 39, 2101));
                    C0005.m1663(sM16153, C0047.m7763(sb));
                    break;
                } catch (Exception unused2) {
                    return;
                }
        }
    }
}