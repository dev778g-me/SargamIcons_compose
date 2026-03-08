package icons.filled

import androidx.compose.ui.graphics.Color
import androidx.compose.ui.graphics.PathFillType
import androidx.compose.ui.graphics.SolidColor
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.graphics.vector.path
import androidx.compose.ui.unit.dp
import icons.Sargam

val Sargam.Filled.SiTableColumns: ImageVector
    get() {
        if (_SiTableColumns != null) {
            return _SiTableColumns!!
        }
        _SiTableColumns = ImageVector.Builder(
            name = "Filled.SiTableColumns",
            defaultWidth = 24.dp,
            defaultHeight = 24.dp,
            viewportWidth = 24f,
            viewportHeight = 24f
        ).apply {
            path(
                fill = SolidColor(Color.Black),
                pathFillType = PathFillType.EvenOdd
            ) {
                moveTo(5.4f, 3f)
                horizontalLineToRelative(13.2f)
                arcTo(2.4f, 2.4f, 0f, isMoreThanHalf = false, isPositiveArc = true, 21f, 5.4f)
                verticalLineToRelative(13.2f)
                arcToRelative(2.4f, 2.4f, 0f, isMoreThanHalf = false, isPositiveArc = true, -2.4f, 2.4f)
                lineTo(5.4f, 21f)
                arcTo(2.4f, 2.4f, 0f, isMoreThanHalf = false, isPositiveArc = true, 3f, 18.6f)
                lineTo(3f, 5.4f)
                arcTo(2.4f, 2.4f, 0f, isMoreThanHalf = false, isPositiveArc = true, 5.4f, 3f)
                moveTo(10f, 4f)
                verticalLineToRelative(16f)
                lineTo(8f, 20f)
                lineTo(8f, 4f)
                close()
                moveTo(16f, 4f)
                verticalLineToRelative(16f)
                horizontalLineToRelative(-2f)
                lineTo(14f, 4f)
                close()
            }
        }.build()

        return _SiTableColumns!!
    }

@Suppress("ObjectPropertyName")
private var _SiTableColumns: ImageVector? = null
