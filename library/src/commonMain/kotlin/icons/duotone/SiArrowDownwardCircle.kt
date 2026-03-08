package icons.duotone

import androidx.compose.ui.graphics.Color
import androidx.compose.ui.graphics.SolidColor
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.graphics.vector.path
import androidx.compose.ui.unit.dp
import icons.Sargam

val Sargam.Duotone.SiArrowDownwardCircle: ImageVector
    get() {
        if (_SiArrowDownwardCircle != null) {
            return _SiArrowDownwardCircle!!
        }
        _SiArrowDownwardCircle = ImageVector.Builder(
            name = "Duotone.SiArrowDownwardCircle",
            defaultWidth = 24.dp,
            defaultHeight = 24.dp,
            viewportWidth = 24f,
            viewportHeight = 24f
        ).apply {
            path(
                fill = SolidColor(Color.Black),
                fillAlpha = 0.16f
            ) {
                moveTo(12f, 22f)
                curveToRelative(5.523f, 0f, 10f, -4.477f, 10f, -10f)
                reflectiveCurveTo(17.523f, 2f, 12f, 2f)
                reflectiveCurveTo(2f, 6.477f, 2f, 12f)
                reflectiveCurveToRelative(4.477f, 10f, 10f, 10f)
            }
            path(fill = SolidColor(Color.Black)) {
                moveTo(8.53f, 11.47f)
                arcToRelative(0.75f, 0.75f, 0f, isMoreThanHalf = false, isPositiveArc = false, -1.06f, 1.06f)
                close()
                moveTo(12f, 16f)
                lineToRelative(-0.53f, 0.53f)
                arcToRelative(0.75f, 0.75f, 0f, isMoreThanHalf = false, isPositiveArc = false, 1.06f, 0f)
                close()
                moveTo(16.53f, 12.53f)
                arcToRelative(0.75f, 0.75f, 0f, isMoreThanHalf = true, isPositiveArc = false, -1.06f, -1.06f)
                close()
                moveTo(12.75f, 8f)
                arcToRelative(0.75f, 0.75f, 0f, isMoreThanHalf = false, isPositiveArc = false, -1.5f, 0f)
                close()
                moveTo(21.25f, 12f)
                arcTo(9.25f, 9.25f, 0f, isMoreThanHalf = false, isPositiveArc = true, 12f, 21.25f)
                verticalLineToRelative(1.5f)
                curveToRelative(5.937f, 0f, 10.75f, -4.813f, 10.75f, -10.75f)
                close()
                moveTo(12f, 21.25f)
                arcTo(9.25f, 9.25f, 0f, isMoreThanHalf = false, isPositiveArc = true, 2.75f, 12f)
                horizontalLineToRelative(-1.5f)
                curveToRelative(0f, 5.937f, 4.813f, 10.75f, 10.75f, 10.75f)
                close()
                moveTo(2.75f, 12f)
                arcTo(9.25f, 9.25f, 0f, isMoreThanHalf = false, isPositiveArc = true, 12f, 2.75f)
                verticalLineToRelative(-1.5f)
                curveTo(6.063f, 1.25f, 1.25f, 6.063f, 1.25f, 12f)
                close()
                moveTo(12f, 2.75f)
                arcTo(9.25f, 9.25f, 0f, isMoreThanHalf = false, isPositiveArc = true, 21.25f, 12f)
                horizontalLineToRelative(1.5f)
                curveToRelative(0f, -5.937f, -4.813f, -10.75f, -10.75f, -10.75f)
                close()
                moveTo(7.47f, 12.53f)
                lineTo(11.47f, 16.53f)
                lineTo(12.53f, 15.47f)
                lineTo(8.53f, 11.47f)
                close()
                moveTo(12.53f, 16.53f)
                lineTo(16.53f, 12.53f)
                lineTo(15.47f, 11.47f)
                lineTo(11.47f, 15.47f)
                close()
                moveTo(12.75f, 16f)
                lineTo(12.75f, 8f)
                horizontalLineToRelative(-1.5f)
                verticalLineToRelative(8f)
                close()
            }
        }.build()

        return _SiArrowDownwardCircle!!
    }

@Suppress("ObjectPropertyName")
private var _SiArrowDownwardCircle: ImageVector? = null
