package icons.duotone

import androidx.compose.ui.graphics.Color
import androidx.compose.ui.graphics.SolidColor
import androidx.compose.ui.graphics.StrokeCap
import androidx.compose.ui.graphics.StrokeJoin
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.graphics.vector.path
import androidx.compose.ui.unit.dp
import icons.Sargam

val Sargam.Duotone.SiPinAlt2: ImageVector
    get() {
        if (_SiPinAlt2 != null) {
            return _SiPinAlt2!!
        }
        _SiPinAlt2 = ImageVector.Builder(
            name = "Duotone.SiPinAlt2",
            defaultWidth = 24.dp,
            defaultHeight = 24.dp,
            viewportWidth = 24f,
            viewportHeight = 24f
        ).apply {
            path(
                fill = SolidColor(Color.Black),
                fillAlpha = 0.16f
            ) {
                moveTo(12f, 12.91f)
                arcTo(5.455f, 5.455f, 0f, isMoreThanHalf = true, isPositiveArc = false, 12f, 2f)
                arcToRelative(5.455f, 5.455f, 0f, isMoreThanHalf = false, isPositiveArc = false, 0f, 10.91f)
            }
            path(
                stroke = SolidColor(Color.Black),
                strokeLineWidth = 1.5f,
                strokeLineCap = StrokeCap.Round,
                strokeLineJoin = StrokeJoin.Round
            ) {
                moveTo(12f, 12.91f)
                arcTo(5.455f, 5.455f, 0f, isMoreThanHalf = true, isPositiveArc = false, 12f, 2f)
                arcToRelative(5.455f, 5.455f, 0f, isMoreThanHalf = false, isPositiveArc = false, 0f, 10.91f)
                moveToRelative(0f, 0f)
                verticalLineToRelative(5.454f)
                moveToRelative(3.636f, -1.632f)
                curveToRelative(3.725f, 0.396f, 6.364f, 1.384f, 6.364f, 2.54f)
                curveTo(22f, 20.78f, 17.523f, 22f, 12f, 22f)
                reflectiveCurveTo(2f, 20.78f, 2f, 19.273f)
                curveToRelative(0f, -1.157f, 2.64f, -2.145f, 6.364f, -2.541f)
            }
        }.build()

        return _SiPinAlt2!!
    }

@Suppress("ObjectPropertyName")
private var _SiPinAlt2: ImageVector? = null
