package com.github.catvod.spider.merge.W;

import android.view.View;
import android.widget.CheckBox;
import android.widget.SeekBar;
import com.github.catvod.spider.merge.P0.C0024;
import com.github.catvod.spider.merge.Q0.C0025;
import com.github.catvod.spider.merge.V.C0031;
import com.github.catvod.spider.merge.Z.C0040;
import com.github.catvod.spider.merge.d.C0047;
import com.github.catvod.spider.merge.d0.C0048;
import com.github.catvod.spider.merge.d1.C0049;
import com.github.catvod.spider.merge.i0.C0055;
import com.github.catvod.spider.merge.v.C0062;
import com.github.catvod.spider.p000mergexbpq.c.C0009;
import com.github.catvod.spider.p000mergexbpq.e0.C0011;
import java.util.ArrayList;

/* renamed from: com.github.catvod.spider.merge.W.d, reason: case insensitive filesystem */
/* loaded from: classes.dex */
public final class C0228d implements SeekBar.OnSeekBarChangeListener {
    public final /* synthetic */ SeekBar a;
    public final /* synthetic */ SeekBar b;
    public final /* synthetic */ SeekBar c;
    public final /* synthetic */ View d;
    public final /* synthetic */ CheckBox e;
    public final /* synthetic */ int f;
    public final /* synthetic */ h g;

    public C0228d(h hVar, SeekBar seekBar, SeekBar seekBar2, SeekBar seekBar3, View view, CheckBox checkBox, int i) {
        this.g = hVar;
        this.a = seekBar;
        this.b = seekBar2;
        this.c = seekBar3;
        this.d = view;
        this.e = checkBox;
        this.f = i;
    }

    @Override // android.widget.SeekBar.OnSeekBarChangeListener
    public final void onProgressChanged(SeekBar seekBar, int i, boolean z) {
        int iM8005 = C0049.m8005(C0009.m2097(this));
        int iM80052 = C0049.m8005(C0024.m4655(this));
        int iM80053 = C0049.m8005(C0031.m5658(this));
        C0048.m7907(C0025.m4858(this), C0040.m6608(iM8005, iM80052, iM80053));
        if (C0031.m5606(C0062.m9441(this))) {
            int iM6608 = C0040.m6608(iM8005, iM80052, iM80053);
            h hVarM4825 = C0025.m4825(this);
            int iM5562 = C0031.m5562(this);
            if (iM5562 < 0) {
                C0047.m7777(hVarM4825);
                return;
            }
            ArrayList arrayListM9406 = C0062.m9406(hVarM4825);
            if (iM5562 < C0009.m2139(arrayListM9406)) {
                C0055.m8716(arrayListM9406, iM5562, C0011.m2808(iM6608));
            }
        }
    }

    @Override // android.widget.SeekBar.OnSeekBarChangeListener
    public final void onStartTrackingTouch(SeekBar seekBar) {
    }

    @Override // android.widget.SeekBar.OnSeekBarChangeListener
    public final void onStopTrackingTouch(SeekBar seekBar) {
    }
}