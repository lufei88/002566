package com.github.catvod.spider.merge.W;

import android.widget.CompoundButton;
import android.widget.SeekBar;
import com.github.catvod.spider.merge.F0.C0018;
import com.github.catvod.spider.merge.P0.C0024;
import com.github.catvod.spider.merge.Q0.C0026;
import com.github.catvod.spider.merge.Z.C0040;
import com.github.catvod.spider.merge.b.C0044;
import com.github.catvod.spider.merge.d1.C0049;
import com.github.catvod.spider.merge.i0.C0055;
import com.github.catvod.spider.merge.v.C0062;
import com.github.catvod.spider.p000mergexbpq.Q.C0002;
import com.github.catvod.spider.p000mergexbpq.S.C0004;
import com.github.catvod.spider.p000mergexbpq.c.C0009;
import com.github.catvod.spider.p000mergexbpq.e0.C0011;
import java.util.ArrayList;

/* renamed from: com.github.catvod.spider.merge.W.e, reason: case insensitive filesystem */
/* loaded from: classes.dex */
public final class C0229e implements CompoundButton.OnCheckedChangeListener {
    public final /* synthetic */ SeekBar a;
    public final /* synthetic */ SeekBar b;
    public final /* synthetic */ SeekBar c;
    public final /* synthetic */ int d;
    public final /* synthetic */ h e;

    public C0229e(h hVar, SeekBar seekBar, SeekBar seekBar2, SeekBar seekBar3, int i) {
        this.e = hVar;
        this.a = seekBar;
        this.b = seekBar2;
        this.c = seekBar3;
        this.d = i;
    }

    @Override // android.widget.CompoundButton.OnCheckedChangeListener
    public final void onCheckedChanged(CompoundButton compoundButton, boolean z) {
        SeekBar seekBarM4746 = C0024.m4746(this);
        C0044.m7378(seekBarM4746, z);
        SeekBar seekBarM4908 = C0026.m4908(this);
        C0044.m7378(seekBarM4908, z);
        SeekBar seekBarM1315 = C0002.m1315(this);
        C0044.m7378(seekBarM1315, z);
        if (!z) {
            return;
        }
        int iM8005 = C0049.m8005(seekBarM4746);
        int iM80052 = C0049.m8005(seekBarM4908);
        int iM80053 = C0049.m8005(seekBarM1315);
        int iM3909 = C0018.m3909(this);
        int i = iM3909 + 1;
        while (true) {
            h hVarM2819 = C0011.m2819(this);
            ArrayList arrayListM9406 = C0062.m9406(hVarM2819);
            if (C0009.m2139(arrayListM9406) >= i) {
                C0055.m8716(C0062.m9406(hVarM2819), iM3909, C0011.m2808(C0040.m6608(iM8005, iM80052, iM80053)));
                return;
            }
            C0004.m1532(arrayListM9406, C0011.m2808(-16777216));
        }
    }
}