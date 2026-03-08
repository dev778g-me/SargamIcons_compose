package icons.regular

import androidx.compose.ui.graphics.Color
import androidx.compose.ui.graphics.SolidColor
import androidx.compose.ui.graphics.StrokeCap
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.graphics.vector.path
import androidx.compose.ui.unit.dp
import icons.Sargam

val Sargam.Regular.SiCopyright: ImageVector
    get() {
        if (_SiCopyright != null) {
            return _SiCopyright!!
        }
        _SiCopyright = ImageVector.Builder(
            name = "Regular.SiCopyright",
            defaultWidth = 24.dp,
            defaultHeight = 24.dp,
            viewportWidth = 24f,
            viewportHeight = 24f
        ).apply {
            path(
                stroke = SolidColor(Color.Black),
                strokeLineWidth = 1.5f,
                strokeLineCap = StrokeCap.Round
            ) {
                moveTo(15.33f, 10.238f)
                curveTo(14.876f, 8.865f, 13.795f, 8f, 12.227f, 8f)
                curveTo(10.164f, 8f, 8.66f, 9.643f, 8.66f, 12f)
                reflectiveCurveToRelative(1.503f, 4f, 3.567f, 4f)
                curveToRelative(1.568f, 0f, 2.65f, -0.865f, 3.103f, -2.238f)
                moveTo(22f, 12f)
                curveToRelative(0f, -5.523f, -4.477f, -10f, -10f, -10f)
                reflectiveCurveTo(2f, 6.477f, 2f, 12f)
                reflectiveCurveToRelative(4.477f, 10f, 10f, 10f)
                reflectiveCurveToRelative(10f, -4.477f, 10f, -10f)
                close()
            }
        }.build()

        return _SiCopyright!!
    }

@Suppress("ObjectPropertyName")
private var _SiCopyright: ImageVector? = null
