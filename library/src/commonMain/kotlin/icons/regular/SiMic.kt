package icons.regular

import androidx.compose.ui.graphics.Color
import androidx.compose.ui.graphics.SolidColor
import androidx.compose.ui.graphics.StrokeCap
import androidx.compose.ui.graphics.StrokeJoin
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.graphics.vector.path
import androidx.compose.ui.unit.dp
import icons.Sargam

val Sargam.Regular.SiMic: ImageVector
    get() {
        if (_SiMic != null) {
            return _SiMic!!
        }
        _SiMic = ImageVector.Builder(
            name = "Regular.SiMic",
            defaultWidth = 24.dp,
            defaultHeight = 24.dp,
            viewportWidth = 24f,
            viewportHeight = 24f
        ).apply {
            path(
                stroke = SolidColor(Color.Black),
                strokeLineWidth = 1.5f,
                strokeLineCap = StrokeCap.Round,
                strokeLineJoin = StrokeJoin.Round
            ) {
                moveTo(12f, 23f)
                verticalLineToRelative(-3f)
                moveToRelative(0f, 0f)
                arcToRelative(8f, 8f, 0f, isMoreThanHalf = false, isPositiveArc = true, -8f, -8f)
                moveToRelative(8f, 8f)
                arcToRelative(8f, 8f, 0f, isMoreThanHalf = false, isPositiveArc = false, 8f, -8f)
                moveToRelative(-8f, 5f)
                curveToRelative(-2.75f, 0f, -5f, -2.172f, -5f, -4.828f)
                verticalLineTo(5.828f)
                curveTo(7f, 3.172f, 9.25f, 1f, 12f, 1f)
                reflectiveCurveToRelative(5f, 2.172f, 5f, 4.828f)
                verticalLineToRelative(6.344f)
                curveTo(17f, 14.828f, 14.75f, 17f, 12f, 17f)
            }
        }.build()

        return _SiMic!!
    }

@Suppress("ObjectPropertyName")
private var _SiMic: ImageVector? = null
