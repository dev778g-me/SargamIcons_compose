package icons.filled

import androidx.compose.ui.graphics.Color
import androidx.compose.ui.graphics.PathFillType
import androidx.compose.ui.graphics.SolidColor
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.graphics.vector.path
import androidx.compose.ui.unit.dp
import icons.Sargam

val Sargam.Filled.SiInventory: ImageVector
    get() {
        if (_SiInventory != null) {
            return _SiInventory!!
        }
        _SiInventory = ImageVector.Builder(
            name = "Filled.SiInventory",
            defaultWidth = 24.dp,
            defaultHeight = 24.dp,
            viewportWidth = 24f,
            viewportHeight = 24f
        ).apply {
            path(
                fill = SolidColor(Color.Black),
                pathFillType = PathFillType.EvenOdd
            ) {
                moveTo(0f, 4.6f)
                arcTo(2.6f, 2.6f, 0f, isMoreThanHalf = false, isPositiveArc = true, 2.6f, 2f)
                horizontalLineToRelative(18.8f)
                arcTo(2.6f, 2.6f, 0f, isMoreThanHalf = false, isPositiveArc = true, 24f, 4.6f)
                verticalLineToRelative(0.8f)
                arcTo(2.6f, 2.6f, 0f, isMoreThanHalf = false, isPositiveArc = true, 21.4f, 8f)
                horizontalLineTo(21f)
                verticalLineToRelative(10.6f)
                curveToRelative(0f, 1.33f, -1.07f, 2.4f, -2.4f, 2.4f)
                horizontalLineTo(5.4f)
                curveTo(4.07f, 21f, 3f, 19.93f, 3f, 18.6f)
                verticalLineTo(8f)
                horizontalLineToRelative(-0.4f)
                arcTo(2.6f, 2.6f, 0f, isMoreThanHalf = false, isPositiveArc = true, 0f, 5.4f)
                close()
                moveTo(2.6f, 4f)
                arcToRelative(0.6f, 0.6f, 0f, isMoreThanHalf = false, isPositiveArc = false, -0.6f, 0.6f)
                verticalLineToRelative(0.8f)
                arcToRelative(0.6f, 0.6f, 0f, isMoreThanHalf = false, isPositiveArc = false, 0.6f, 0.6f)
                horizontalLineToRelative(18.8f)
                arcToRelative(0.6f, 0.6f, 0f, isMoreThanHalf = false, isPositiveArc = false, 0.6f, -0.6f)
                verticalLineToRelative(-0.8f)
                arcToRelative(0.6f, 0.6f, 0f, isMoreThanHalf = false, isPositiveArc = false, -0.6f, -0.6f)
                close()
                moveTo(8f, 10f)
                arcToRelative(1f, 1f, 0f, isMoreThanHalf = true, isPositiveArc = false, 0f, 2f)
                horizontalLineToRelative(8f)
                arcToRelative(1f, 1f, 0f, isMoreThanHalf = true, isPositiveArc = false, 0f, -2f)
                close()
            }
        }.build()

        return _SiInventory!!
    }

@Suppress("ObjectPropertyName")
private var _SiInventory: ImageVector? = null
