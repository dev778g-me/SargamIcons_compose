package icons.regular

import androidx.compose.ui.graphics.Color
import androidx.compose.ui.graphics.SolidColor
import androidx.compose.ui.graphics.StrokeJoin
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.graphics.vector.path
import androidx.compose.ui.unit.dp
import icons.Sargam

val Sargam.Regular.SiPhoneEnabled: ImageVector
    get() {
        if (_SiPhoneEnabled != null) {
            return _SiPhoneEnabled!!
        }
        _SiPhoneEnabled = ImageVector.Builder(
            name = "Regular.SiPhoneEnabled",
            defaultWidth = 24.dp,
            defaultHeight = 24.dp,
            viewportWidth = 24f,
            viewportHeight = 24f
        ).apply {
            path(
                stroke = SolidColor(Color.Black),
                strokeLineWidth = 1.5f,
                strokeLineJoin = StrokeJoin.Round
            ) {
                moveToRelative(16.82f, 10.27f)
                lineToRelative(-6.504f, 6.46f)
                curveToRelative(-0.697f, -0.807f, -5.11f, -5.538f, -7.316f, 0.924f)
                curveToRelative(0f, 0f, 0.232f, 3.346f, 4.994f, 3.346f)
                curveToRelative(3.367f, 0f, 6.851f, -4.038f, 9.29f, -6.346f)
                curveToRelative(2.09f, -1.962f, 3.716f, -4.5f, 3.716f, -6.808f)
                curveTo(21f, 3.116f, 17.748f, 3f, 17.748f, 3f)
                curveToRelative(-7.432f, 2.538f, -0.929f, 7.27f, -0.929f, 7.27f)
                close()
            }
        }.build()

        return _SiPhoneEnabled!!
    }

@Suppress("ObjectPropertyName")
private var _SiPhoneEnabled: ImageVector? = null
