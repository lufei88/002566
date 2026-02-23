package com.github.catvod.spider.merge.h0;

import android.view.View;
import android.widget.AdapterView;
import android.widget.Spinner;
import com.github.catvod.spider.merge.G.C0019;
import com.github.catvod.spider.merge.N.C0023;
import com.github.catvod.spider.merge.T0.C0030;
import com.github.catvod.spider.merge.Z.C0038;
import com.github.catvod.spider.merge.a0.C0042;
import com.github.catvod.spider.merge.d1.C0049;
import com.github.catvod.spider.merge.p.C0057;
import com.github.catvod.spider.merge.x0.C0063;
import com.github.catvod.spider.p000mergexbpq.x.C0015;

/* loaded from: classes.dex */
public final class K implements AdapterView.OnItemSelectedListener {

    /* renamed from: short, reason: not valid java name */
    private static final short[] f807short = {1910, 1852, 1849, 1846, 1845, 1837, 1804, 1840, 1853, 1845, 1853, 25600, 20731, 28826, -32064, 22704, 19811, 19729, -25678, 21539, 29762, -31208, 23656, 18875, 18889, -24726, -1794, 23040, -29620, 30876};
    public final /* synthetic */ Spinner a;

    public K(Spinner spinner) {
        this.a = spinner;
    }

    /* renamed from: ۣۤۡۡ, reason: not valid java name and contains not printable characters */
    public static short[] m8659() {
        if (C0015.m3433() >= 0) {
            return f807short;
        }
        return null;
    }

    @Override // android.widget.AdapterView.OnItemSelectedListener
    public final void onItemSelected(AdapterView adapterView, View view, int i, long j) {
        String str = (String) C0049.m7983(adapterView, i);
        String strM8007 = C0049.m8007(m8659(), 0, 11, 1880);
        if (i != 0 && i != 1 && i != 2 && i != 3) {
            if (i != 4) {
                return;
            }
            if (C0057.m8953(C0019.m4032())) {
                C0038.m6402(C0042.m7151(m8659(), 11, 8, 810));
                C0063.m9594(C0030.m5377(this), 0);
                return;
            }
            C0038.m6402(C0023.m4536(m8659(), 19, 11, 2034));
        }
        C0042.m7162(str, strM8007);
    }

    @Override // android.widget.AdapterView.OnItemSelectedListener
    public final void onNothingSelected(AdapterView adapterView) {
    }
}