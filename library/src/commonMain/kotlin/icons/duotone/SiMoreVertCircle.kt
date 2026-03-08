package icons.duotone

import androidx.compose.ui.graphics.Color
import androidx.compose.ui.graphics.SolidColor
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.graphics.vector.path
import androidx.compose.ui.unit.dp
import icons.Sargam

val Sargam.Duotone.SiMoreVertCircle: ImageVector
    get() {
        if (_SiMoreVertCircle != null) {
            return _SiMoreVertCircle!!
        }
        _SiMoreVertCircle = ImageVector.Builder(
            name = "Duotone.SiMoreVertCircle",
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
            path(
                stroke = SolidColor(Color.Black),
                strokeLineWidth = 1.5f
            ) {
                moveTo(12f, 22f)
                curveToRelative(5.523f, 0f, 10f, -4.477f, 10f, -10f)
                reflectiveCurveTo(17.523f, 2f, 12f, 2f)
                reflectiveCurveTo(2f, 6.477f, 2f, 12f)
                reflectiveCurveToRelative(4.477f, 10f, 10f, 10f)
                close()
            }
            path(
                stroke = SolidColor(Color.Black),
                strokeLineWidth = 1.5f
            ) {
                moveTo(12f, 13f)
                arcToRelative(1f, 1f, 0f, isMoreThanHalf = true, isPositiveArc = false, 0f, -2f)
                arcToRelative(1f, 1f, 0f, isMoreThanHalf = false, isPositiveArc = false, 0f, 2f)
                close()
                moveTo(12f, 18f)
                arcToRelative(1f, 1f, 0f, isMoreThanHalf = true, isPositiveArc = false, 0f, -2f)
                arcToRelative(1f, 1f, 0f, isMoreThanHalf = false, isPositiveArc = false, 0f, 2f)
                close()
                moveTo(12f, 8f)
                arcToRelative(1f, 1f, 0f, isMoreThanHalf = true, isPositiveArc = false, 0f, -2f)
                arcToRelative(1f, 1f, 0f, isMoreThanHalf = false, isPositiveArc = false, 0f, 2f)
                close()
            }
        }.build()

        return _SiMoreVertCircle!!
    }

@Suppress("ObjectPropertyName")
private var _SiMoreVertCircle: ImageVector? = null
