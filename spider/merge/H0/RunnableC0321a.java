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
import com.github.catvod.spider.merge.S0.C0029;
import com.github.catvod.spider.merge.T0.C0030;
import com.github.catvod.spider.merge.V.C0031;
import com.github.catvod.spider.merge.V.C0032;
import com.github.catvod.spider.merge.V.C0033;
import com.github.catvod.spider.merge.W.DialogInterfaceOnClickListenerC0226b;
import com.github.catvod.spider.merge.Y.C0036;
import com.github.catvod.spider.merge.Z.C0037;
import com.github.catvod.spider.merge.Z0.C0041;
import com.github.catvod.spider.merge.a0.C0042;
import com.github.catvod.spider.merge.d.C0047;
import com.github.catvod.spider.merge.d1.C0049;
import com.github.catvod.spider.merge.f1.C0053;
import com.github.catvod.spider.merge.h.C0054;
import com.github.catvod.spider.merge.p.C0057;
import com.github.catvod.spider.merge.y0.C0064;
import com.github.catvod.spider.p000mergexbpq.Q.C0000;
import com.github.catvod.spider.p000mergexbpq.Q.C0001;
import com.github.catvod.spider.p000mergexbpq.R.C0003;
import com.github.catvod.spider.p000mergexbpq.S.C0004;
import com.github.catvod.spider.p000mergexbpq.S.C0005;
import com.github.catvod.spider.p000mergexbpq.a0.C0007;
import com.github.catvod.spider.p000mergexbpq.c.C0009;
import com.github.catvod.spider.p000mergexbpq.i.C0012;
import com.github.catvod.spider.p000mergexbpq.j.C0013;
import com.github.catvod.spider.p000mergexbpq.x.C0016;
import java.util.List;

/* renamed from: com.github.catvod.spider.merge.h0.a, reason: case insensitive filesystem */
/* loaded from: classes.dex */
public final /* synthetic */ class RunnableC0321a implements Runnable {

    /* renamed from: short, reason: not valid java name */
    private static final short[] f811short = {829, 801, 801, 805, 879, 890, 890, 1594, 1593, 1593, 1591, 1592, 1583, 1648, 1650, 1647, 1656, 1657, 1599, 1636, 1647, 1597, 1651, 1637, 1633, 1635, 1640, 1636, 1633, 1646, 1645, 1653, 1574, 1639, 1647, 1597, 1640, 1652, 1645, 1644, 1653, 1651, 1637, 1650, 1636, 1633, 1646, 1645, 1653, 470, 433, 443, 429, 431, 470, 471, 413, 408, 407, 404, 396, 23394, -32477, 25340, 29161, 21646, 31683, 22017, 18554, 21658, 25789, -26881, -1929, 18856, 25154, 25708, 1799, 1822, 1794, 1795, 25117, 25603, 25800, 21646, -30651, -29663, 21207, 23691, 24039, 24599, 20561, 899, -29298, -30230, 22300, 22848, 22572, 26076, 21914, 1611, -30144, -29148, 20690, 24206, 24546, 25106, 21076, 388, -29318, -30434, 22504, -30873, 23831, 18628, 22964, 22744, 25896, 21870, 25769, 32451, -30383, 22439};
    public final /* synthetic */ int a;
    public final /* synthetic */ com.github.catvod.spider.merge.a0.S b;

    public /* synthetic */ RunnableC0321a(com.github.catvod.spider.merge.a0.S s, int i) {
        this.a = i;
        this.b = s;
    }

    /* renamed from: ۟ۦۣۣۤ, reason: not valid java name and contains not printable characters */
    public static short[] m8663() {
        if (C0029.m5282() > 0) {
            return f811short;
        }
        return null;
    }

    @Override // java.lang.Runnable
    public final void run() {
        switch (C0017.m3652(this)) {
            case 0:
                com.github.catvod.spider.merge.a0.S sM4448 = C0022.m4448(this);
                C0047.m7777(sM4448);
                try {
                    List listM5833 = C0033.m5833(C0032.m5708(m8663(), 49, 12, 505));
                    int iM3103 = C0013.m3103(16);
                    FrameLayout.LayoutParams layoutParams = new FrameLayout.LayoutParams(-1, -2);
                    FrameLayout frameLayout = new FrameLayout(C0031.m5652());
                    SpannableString spannableString = new SpannableString(C0054.m8574(m8663(), 61, 23, 1901));
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
                    String strM3102 = C0013.m3102(listM5833, 0);
                    if (C0057.m8953(strM3102)) {
                        C0009.m2052(editText, C0049.m8007(m8663(), 84, 8, 946));
                    } else {
                        C0042.m7106(editText, strM3102);
                    }
                    C0041.m6790(frameLayout, editText, layoutParams);
                    EditText editText2 = new EditText(C0031.m5652());
                    C0053.m8415(editText2, 1);
                    String strM31022 = C0013.m3102(listM5833, 1);
                    if (C0057.m8953(strM31022)) {
                        C0009.m2052(editText2, C0007.m1842(m8663(), 92, 8, 1657));
                    } else {
                        C0042.m7106(editText2, strM31022);
                    }
                    FrameLayout.LayoutParams layoutParams2 = new FrameLayout.LayoutParams(-1, -2);
                    C0012.m2963(layoutParams2, iM3103, (iM3103 * 4) + C0036.m6186(editText), iM3103, iM3103);
                    C0041.m6790(frameLayout, editText2, layoutParams2);
                    EditText editText3 = new EditText(C0031.m5652());
                    C0053.m8415(editText3, 1);
                    String strM31023 = C0013.m3102(listM5833, 2);
                    if (C0057.m8953(strM31023)) {
                        C0009.m2052(editText3, C0003.m1398(m8663(), 100, 8, 439));
                    } else {
                        C0042.m7106(editText3, strM31023);
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
                    sM4448.b = C0019.m4124(C0049.m8029(C0030.m5442(C0020.m4201(C0047.m7848(C0036.m6223(new AlertDialog.Builder(C0022.m4453()), C0003.m1398(m8663(), 108, 10, 1677)), frameLayout), C0001.m1189(m8663(), 118, 4, 1730), new DialogInterfaceOnClickListenerC0226b(4, sM4448)), R.string.cancel, null), R.string.ok, new com.github.catvod.spider.merge.a0.O(sM4448, editText, editText2, editText3, 1)));
                    break;
                } catch (Exception unused) {
                    return;
                }
            case 1:
                com.github.catvod.spider.merge.a0.S sM44482 = C0022.m4448(this);
                C0047.m7777(sM44482);
                C0016.m3575(new RunnableC0321a(sM44482, 2));
                break;
            default:
                com.github.catvod.spider.merge.a0.S sM44483 = C0022.m4448(this);
                C0047.m7777(sM44483);
                try {
                    StringBuilder sb = new StringBuilder(C0012.m2973(m8663(), 0, 7, 853));
                    C0018.m3933(sb, C0017.m3708());
                    C0018.m3933(sb, C0013.m3106(m8663(), 7, 42, 1536));
                    C0005.m1663(sM44483, C0047.m7763(sb));
                    break;
                } catch (Exception unused2) {
                    return;
                }
        }
    }
}