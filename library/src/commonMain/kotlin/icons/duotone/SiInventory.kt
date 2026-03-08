package icons.duotone

import androidx.compose.ui.graphics.Color
import androidx.compose.ui.graphics.SolidColor
import androidx.compose.ui.graphics.StrokeCap
import androidx.compose.ui.graphics.StrokeJoin
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.graphics.vector.path
import androidx.compose.ui.unit.dp
import icons.Sargam

val Sargam.Duotone.SiInventory: ImageVector
    get() {
        if (_SiInventory != null) {
            return _SiInventory!!
        }
        _SiInventory = ImageVector.Builder(
            name = "Duotone.SiInventory",
            defaultWidth = 24.dp,
            defaultHeight = 24.dp,
            viewportWidth = 24f,
            viewportHeight = 24f
        ).apply {
            path(
                fill = SolidColor(Color.Black),
                fillAlpha = 0.16f
            ) {
                moveTo(21f, 7f)
                verticalLineToRelative(11.6f)
                curveToRelative(0f, 1.33f, -1.07f, 2.4f, -2.4f, 2.4f)
                horizontalLineTo(5.4f)
                curveTo(4.07f, 21f, 3f, 19.93f, 3f, 18.6f)
                verticalLineTo(7f)
            }
            path(
                stroke = SolidColor(Color.Black),
                strokeLineWidth = 1.5f,
                strokeLineCap = StrokeCap.Round,
                strokeLineJoin = StrokeJoin.Round
            ) {
                moveTo(21f, 7f)
                verticalLineToRelative(11.6f)
                curveToRelative(0f, 1.33f, -1.07f, 2.4f, -2.4f, 2.4f)
                horizontalLineTo(5.4f)
                curveTo(4.07f, 21f, 3f, 19.93f, 3f, 18.6f)
                verticalLineTo(7f)
                moveToRelative(5f, 4f)
                horizontalLineToRelative(8f)
                moveTo(2.6f, 3f)
                horizontalLineToRelative(18.8f)
                arcTo(1.6f, 1.6f, 0f, isMoreThanHalf = false, isPositiveArc = true, 23f, 4.6f)
                verticalLineToRelative(0.8f)
                arcTo(1.6f, 1.6f, 0f, isMoreThanHalf = false, isPositiveArc = true, 21.4f, 7f)
                horizontalLineTo(2.6f)
                arcTo(1.6f, 1.6f, 0f, isMoreThanHalf = false, isPositiveArc = true, 1f, 5.4f)
                verticalLineToRelative(-0.8f)
                arcTo(1.6f, 1.6f, 0f, isMoreThanHalf = false, isPositiveArc = true, 2.6f, 3f)
            }
        }.build()

        return _SiInventory!!
    }

@Suppress("ObjectPropertyName")
private var _SiInventory: ImageVector? = null
