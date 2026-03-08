package icons.duotone

import androidx.compose.ui.graphics.Color
import androidx.compose.ui.graphics.SolidColor
import androidx.compose.ui.graphics.StrokeCap
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.graphics.vector.path
import androidx.compose.ui.unit.dp
import icons.Sargam

val Sargam.Duotone.SiSunSet: ImageVector
    get() {
        if (_SiSunSet != null) {
            return _SiSunSet!!
        }
        _SiSunSet = ImageVector.Builder(
            name = "Duotone.SiSunSet",
            defaultWidth = 24.dp,
            defaultHeight = 24.dp,
            viewportWidth = 24f,
            viewportHeight = 24f
        ).apply {
            path(
                fill = SolidColor(Color.Black),
                fillAlpha = 0.16f
            ) {
                moveTo(8.57f, 17.93f)
                arcTo(5.98f, 5.98f, 0f, isMoreThanHalf = false, isPositiveArc = true, 6f, 13f)
                curveToRelative(0f, -3.31f, 2.69f, -6f, 6f, -6f)
                reflectiveCurveToRelative(6f, 2.69f, 6f, 6f)
                curveToRelative(0f, 2.05f, -1.03f, 3.86f, -2.6f, 4.94f)
            }
            path(
                stroke = SolidColor(Color.Black),
                strokeLineWidth = 1.5f,
                strokeLineCap = StrokeCap.Round
            ) {
                moveTo(12f, 4f)
                verticalLineTo(2f)
                moveTo(3f, 13f)
                horizontalLineTo(1f)
                moveToRelative(22f, 0f)
                horizontalLineToRelative(-2f)
                moveToRelative(-1.222f, -7.778f)
                lineToRelative(-1.414f, 1.414f)
                moveToRelative(-12.728f, 0f)
                lineTo(4.222f, 5.222f)
                moveTo(4f, 18f)
                horizontalLineToRelative(16f)
                moveTo(8f, 21f)
                horizontalLineToRelative(8f)
                moveToRelative(-7.43f, -3.07f)
                arcTo(5.98f, 5.98f, 0f, isMoreThanHalf = false, isPositiveArc = true, 6f, 13f)
                curveToRelative(0f, -3.31f, 2.69f, -6f, 6f, -6f)
                reflectiveCurveToRelative(6f, 2.69f, 6f, 6f)
                curveToRelative(0f, 2.05f, -1.03f, 3.86f, -2.6f, 4.94f)
                close()
            }
        }.build()

        return _SiSunSet!!
    }

@Suppress("ObjectPropertyName")
private var _SiSunSet: ImageVector? = null
