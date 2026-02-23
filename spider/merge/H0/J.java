package com.github.catvod.spider.merge.h0;

import android.view.View;
import android.widget.AdapterView;
import com.github.catvod.spider.merge.V.C0031;
import com.github.catvod.spider.merge.a0.C0042;
import com.github.catvod.spider.merge.c1.C0046;
import com.github.catvod.spider.merge.d1.C0049;

/* loaded from: classes.dex */
public final class J implements AdapterView.OnItemSelectedListener {

    /* renamed from: short, reason: not valid java name */
    private static final short[] f806short = {1137, 1083, 1086, 1073, 1074, 1066, 1067, 1062, 1071, 1082};

    /* renamed from: ۠۟۟ۡ, reason: not valid java name and contains not printable characters */
    public static short[] m8658() {
        if (C0046.m7701() > 0) {
            return f806short;
        }
        return null;
    }

    @Override // android.widget.AdapterView.OnItemSelectedListener
    public final void onItemSelected(AdapterView adapterView, View view, int i, long j) {
        String str = (String) C0049.m7983(adapterView, i);
        String strM5565 = C0031.m5565(m8658(), 0, 10, 1119);
        if (i == 0 || i == 1) {
            C0042.m7162(str, strM5565);
        }
    }

    @Override // android.widget.AdapterView.OnItemSelectedListener
    public final void onNothingSelected(AdapterView adapterView) {
    }
}