package com.github.catvod.spider.merge.h0;

import android.R;
import android.app.AlertDialog;
import android.view.View;
import android.widget.EditText;
import android.widget.LinearLayout;
import android.widget.TextView;
import com.github.catvod.spider.merge.C.C0017;
import com.github.catvod.spider.merge.G.C0019;
import com.github.catvod.spider.merge.K0.C0022;
import com.github.catvod.spider.merge.Q0.C0025;
import com.github.catvod.spider.merge.Q0.C0026;
import com.github.catvod.spider.merge.S0.C0029;
import com.github.catvod.spider.merge.V.C0031;
import com.github.catvod.spider.merge.V.C0032;
import com.github.catvod.spider.merge.W.DialogInterfaceOnClickListenerC0227c;
import com.github.catvod.spider.merge.Y.C0036;
import com.github.catvod.spider.merge.Z.C0037;
import com.github.catvod.spider.merge.Z.C0038;
import com.github.catvod.spider.merge.Z.C0039;
import com.github.catvod.spider.merge.a0.C0042;
import com.github.catvod.spider.merge.a1.C0043;
import com.github.catvod.spider.merge.b.C0044;
import com.github.catvod.spider.merge.d.C0047;
import com.github.catvod.spider.merge.d1.C0049;
import com.github.catvod.spider.merge.f1.C0053;
import com.github.catvod.spider.merge.o0.C0056;
import com.github.catvod.spider.merge.p.C0057;
import com.github.catvod.spider.merge.v.C0062;
import com.github.catvod.spider.merge.x0.C0063;
import com.github.catvod.spider.merge.y0.C0064;
import com.github.catvod.spider.merge.z.C0065;
import com.github.catvod.spider.p000mergexbpq.S.C0004;
import com.github.catvod.spider.p000mergexbpq.a0.C0007;
import com.github.catvod.spider.p000mergexbpq.c.C0009;
import com.github.catvod.spider.p000mergexbpq.c0.C0010;
import com.github.catvod.spider.p000mergexbpq.j.C0013;
import com.github.catvod.spider.p000mergexbpq.x.C0016;

/* loaded from: classes.dex */
public final /* synthetic */ class r implements View.OnClickListener {

    /* renamed from: short, reason: not valid java name */
    private static final short[] f820short = {27796, 26563, 1260, 1245, 1220, 22338, 19016, 21812, 19117, 19079, 22771, 18979, 19405, -31417, 22876, 29225, 19094, -25547, -1119, 22338, 19016, -29834, -29471, 24353, 21957, -31417, 24375, 19172, -1119, 21847, 30493, -28349, -25547, -28838, 22157, -27959, 27796, 29251, 23544, 22690, -32029, 24892, 24874, 19035, 23956, 19110, 29225, 1241, 1221, 1224, 1216, 1224, 1155, 1221, 1241, 1216, 1217, 24874, 19035, -30387, -29399, 21471, 21311, 22787, 660, 660, 660, -32603, 23253, 20230, 20340, -26153, 20396, 31054, 32085, 24225, -30044, -28992, 20534, 26470, 30883, -32493, -31369, 23425, 21981, 21681, 23393, 20829};
    public final /* synthetic */ int a;
    public final /* synthetic */ Object b;

    public /* synthetic */ r(int i, Object obj) {
        this.a = i;
        this.b = obj;
    }

    /* renamed from: ۠ۧۦۡ, reason: not valid java name and contains not printable characters */
    public static short[] m8672() {
        if (C0049.m8038() <= 0) {
            return f820short;
        }
        return null;
    }

    @Override // android.view.View.OnClickListener
    public final void onClick(View view) {
        String strM3646;
        switch (C0029.m5210(this)) {
            case 0:
                C0022.m4419((C0340u) C0063.m9515(this));
                break;
            case 1:
                x xVar = (x) C0063.m9515(this);
                String strM9640 = C0064.m9640(C0037.m6312(C0065.m9797(C0022.m4463(xVar))));
                String strM96402 = C0064.m9640(C0037.m6312(C0065.m9797(C0043.m7315(xVar))));
                if (!C0057.m8953(strM9640)) {
                    if (!C0057.m8953(strM96402)) {
                        C0010.m2319(C0047.m7815(xVar), 0);
                        C0044.m7378(C0022.m4463(xVar), false);
                        C0044.m7378(C0043.m7315(xVar), false);
                        C0044.m7378(C0017.m3703(C0039.m6522(xVar), -1), false);
                        C0025.m4829(new com.github.catvod.spider.merge.W.i(xVar, strM9640, strM96402, 10));
                        break;
                    } else {
                        strM3646 = C0017.m3646(m8672(), 81, 7, 2788);
                    }
                } else {
                    strM3646 = C0062.m9389(m8672(), 76, 5, 339);
                }
                C0038.m6402(strM3646);
                break;
            default:
                com.github.catvod.spider.merge.a0.S s = (com.github.catvod.spider.merge.a0.S) C0063.m9515(this);
                C0047.m7777(s);
                try {
                    C0004.m1577(C0013.m3145(s));
                    String strM3106 = C0013.m3106(m8672(), 0, 59, 1197);
                    LinearLayout linearLayout = new LinearLayout(C0031.m5652());
                    C0032.m5684(linearLayout, 1);
                    C0016.m3608(linearLayout, C0013.m3103(16), C0013.m3103(16), C0013.m3103(16), C0013.m3103(16));
                    TextView textView = new TextView(C0031.m5652());
                    C0042.m7106(textView, strM3106);
                    C0039.m6563(textView, 12.0f);
                    C0026.m4878(textView, -16777216);
                    C0037.m6336(linearLayout, textView);
                    EditText editText = new EditText(C0031.m5652());
                    C0009.m2098(editText, C0053.m8433());
                    C0009.m2052(editText, C0019.m4107(m8672(), 59, 8, 698));
                    C0039.m6563(editText, 12.0f);
                    C0016.m3608(editText, C0013.m3103(8), C0013.m3103(8), C0013.m3103(8), C0013.m3103(8));
                    C0026.m4916(editText, R.drawable.edit_text);
                    LinearLayout.LayoutParams layoutParams = new LinearLayout.LayoutParams(-1, -2);
                    layoutParams.topMargin = C0013.m3103(12);
                    C0009.m2112(editText, layoutParams);
                    C0037.m6336(linearLayout, editText);
                    LinearLayout linearLayout2 = new LinearLayout(C0031.m5652());
                    C0032.m5684(linearLayout2, 0);
                    C0016.m3608(linearLayout2, 0, C0013.m3103(16), 0, 0);
                    C0037.m6336(linearLayout, linearLayout2);
                    AlertDialog alertDialogM7328 = C0043.m7328(C0047.m7798(C0047.m7848(C0036.m6223(new AlertDialog.Builder(C0022.m4453()), C0032.m5708(m8672(), 67, 7, 335)), linearLayout), C0056.m8911(m8672(), 74, 2, 1339), new DialogInterfaceOnClickListenerC0227c(s, editText, 8)));
                    s.b = alertDialogM7328;
                    C0007.m1816(alertDialogM7328);
                    break;
                } catch (Exception unused) {
                    return;
                }
        }
    }
}